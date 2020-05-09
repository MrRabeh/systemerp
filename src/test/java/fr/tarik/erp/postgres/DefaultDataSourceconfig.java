package fr.tarik.erp.postgres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import ru.yandex.qatools.embed.postgresql.EmbeddedPostgres;

import javax.sql.DataSource;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Paths;
import java.util.Collections;

@Profile("default")
@Configuration
public class DefaultDataSourceconfig {

	@Autowired
	private EmbeddedDataSourceProperties embeddedDataSourceProperties;

	@Bean
	@ConfigurationProperties("spring.datasource")
	@Primary
	public DataSource dataSource() throws IOException {
		URI uri = URI.create(embeddedDataSourceProperties.getUrl().substring(5));
		new EmbeddedPostgres(() -> "9.1.0-1")
				.start(EmbeddedPostgres.cachedRuntimeConfig(
						Paths.get(embeddedDataSourceProperties.getEmbeddedDirectory())),
						uri.getHost(), uri.getPort(), uri.getPath().substring(1),
						embeddedDataSourceProperties.getUsername(),
						embeddedDataSourceProperties.getPassword(),
						Collections.emptyList());

		return DataSourceBuilder
				.create()
				.build();
	}
}

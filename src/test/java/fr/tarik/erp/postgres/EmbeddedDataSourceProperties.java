package fr.tarik.erp.postgres;


import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Primary
@Profile("default")
@ConfigurationProperties("Spring.datasource")
public class EmbeddedDataSourceProperties extends DataSourceProperties {

	private String embeddedDirectory = "target";

	public String getEmbeddedDirectory() {
		return embeddedDirectory;
	}

	public void setEmbeddedDirectory(String embeddedDirectory) {
		this.embeddedDirectory = embeddedDirectory;
	}
}

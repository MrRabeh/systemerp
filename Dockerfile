#############################
#
# com.softathome.component.Extender running on
# a JVM in a container.
#
#############################

FROM openjdk:11-jre

# Maintainer
MAINTAINER "Tarik RABEH <tarik.rabeh@gmail.com">
ARG JAR_FILE=target/systemerp*.jar
# Add the main jar to be run
COPY ${JAR_FILE} systemerp.jar

ENTRYPOINT ["java", "-jar", "/systemerp.jar"]

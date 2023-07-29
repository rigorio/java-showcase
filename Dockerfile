FROM openjdk:11
MAINTAINER rigor.io
COPY target/java-showcase-0.0.1.jar docker-jar.jar
ENTRYPOINT ["java","-jar","/docker-jar.jar"]
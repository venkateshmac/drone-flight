FROM openjdk:8u131-jdk-alpine

MAINTAINER Venkatesh Gaduputi "venkateshmac@icloud.com"

EXPOSE 8080

WORKDIR /usr/local/bin/

COPY /target/drone-flight-gateway-api-0.0.1-SNAPSHOT.jar webapp.jar

CMD ["java", "-jar","webapp.jar"]
FROM maven:3.6.3 AS maven
LABEL MAINTAINER="htyesilyurt@gmail.com"

WORKDIR /opt/producer-service
COPY . /opt/producer-service
RUN mvn clean install -DskipTests

# For Java 11, 
#can't build with next:
FROM adoptopenjdk/openjdk11:alpine-jre
#but building with this:
FROM openjdk:11-jdk-slim

ARG JAR_FILE=producer-service.jar

WORKDIR /opt/producer-service

COPY --from=maven /opt/producer-service/target/${JAR_FILE} /opt/producer-service/

ENTRYPOINT ["java","-jar","producer-service.jar"]

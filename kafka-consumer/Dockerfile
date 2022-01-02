FROM maven:3.6.3 AS maven
LABEL MAINTAINER="htyesilyurt@gmail.com"

WORKDIR /opt/consumer-service
COPY . /opt/consumer-service
RUN mvn clean install -DskipTests

# For Java 11, 
FROM adoptopenjdk/openjdk11:alpine-jre

ARG JAR_FILE=consumer-service.jar

WORKDIR /opt/consumer-service

COPY --from=maven /opt/consumer-service/target/${JAR_FILE} /opt/consumer-service/

ENTRYPOINT ["java","-jar","consumer-service.jar"]
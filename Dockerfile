FROM openjdk:8-jdk-alpine

WORKDIR /app

COPY target/welcom*.jar welcom.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "welcom.jar"]
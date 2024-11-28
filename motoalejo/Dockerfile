FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/motoalejo-0.0.1.jar
COPY ${JAR_FILE} app_motoalejo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app_motoalejo.jar"]
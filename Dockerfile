FROM openjdk:17-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=target/*.jar
ARG CONFIG_FILE=config.yml
COPY ${JAR_FILE} app.jar
COPY ${CONFIG_FILE} config.yml
ENTRYPOINT ["java","-jar","/app.jar"]

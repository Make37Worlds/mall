FROM openjdk:17-ea-jdk-slim
LABEL authors="51511"
COPY target/demo-0.0.1-SNAPSHOT.jar /demo.jar
ENTRYPOINT ["java", "-jar", "/demo.jar"]

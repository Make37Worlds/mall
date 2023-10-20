FROM openjdk:17-ea-jdk-slim
LABEL authors="51511"
COPY target/demo-0.0.1-SNAPSHOT.jar /demo.jar
EXPOSE 80
ENTRYPOINT ["java", "-jar", "/demo.jar"]

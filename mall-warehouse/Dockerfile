# mall-warehouse/Dockerfile
FROM openjdk:17-ea-jdk-slim
ADD target/mall-warehouse-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

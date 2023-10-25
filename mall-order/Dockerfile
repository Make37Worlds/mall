# mall-order/Dockerfile
FROM openjdk:17-ea-jdk-slim
ADD target/mall-order-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]


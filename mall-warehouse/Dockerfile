# mall-warehouse/Dockerfile
FROM openjdk:11-jre-slim
ADD target/mall-warehouse.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

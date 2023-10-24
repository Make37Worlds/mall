# mall-products/Dockerfile
FROM openjdk:11-jre-slim
ADD target/mall-product.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]


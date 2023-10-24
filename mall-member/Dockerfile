# mall-member/Dockerfile
FROM openjdk:11-jre-slim
ADD target/mall-member.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

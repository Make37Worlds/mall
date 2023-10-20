FROM openjdk:17-ea-jdk-slim
LABEL authors="51511"
COPY target/mall.jar /mall.jar
ENTRYPOINT ["java", "-jar", "/mall.jar"]

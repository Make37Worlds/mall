FROM ubuntu:latest
LABEL authors="51511"

ENTRYPOINT ["java", "-jar", "demo.jar"]
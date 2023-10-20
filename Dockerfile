FROM lolhens/baseimage-openjre
LABEL authors="51511"
COPY target/demo.jar /demo.jar
ENTRYPOINT ["java", "-jar", "/demo.jar"]

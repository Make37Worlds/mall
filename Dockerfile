FROM lolhens/baseimage-openjre
LABEL authors="51511"
ADD target/springbootApp.jar mall.jar
EXPOSE 80
ENTRYPOINT ["java", "-jar", "mall.jar"]

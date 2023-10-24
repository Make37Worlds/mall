FROM lolhens/baseimage-openjre
ADD target/springbootApp.jar mall.jar
EXPOSE 80
ENTRYPOINT ["java", "-jar", "mall.jar"]

FROM openjdk:17-jdk
COPY build/libs/* app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/demoapp.jar /app/demoapp.jar
EXPOSE 9797
ENTRYPOINT ["java", "-jar", "demoapp.jar"]
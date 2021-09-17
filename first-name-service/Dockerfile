FROM amazoncorretto:11-alpine

WORKDIR /app
ADD ./first-name-service/build/libs/first-name-service-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 9091
CMD ["java", "-jar", "app.jar"]
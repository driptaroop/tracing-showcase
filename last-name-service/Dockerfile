FROM amazoncorretto:11-alpine

WORKDIR /app
ADD ./last-name-service/build/libs/last-name-service-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 9092
CMD ["java" , "-jar", "app.jar"]
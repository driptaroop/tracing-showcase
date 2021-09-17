FROM amazoncorretto:11-alpine

WORKDIR /app
ADD ./name-generator/build/libs/name-generator-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 9090
CMD ["java", "-jar", "app.jar"]
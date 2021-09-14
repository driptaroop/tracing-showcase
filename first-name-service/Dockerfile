FROM amazoncorretto:11-alpine

WORKDIR /app
ADD ./first-name-service/build/libs/first-name-service-0.0.1-SNAPSHOT.jar app.jar
COPY ./opentelemetry-javaagent-all.jar .

EXPOSE 9091
CMD java -javaagent:opentelemetry-javaagent-all.jar \
         -Dotel.service.name=first-name-service \
         -Dotel.traces.exporter=jaeger \
         -Dotel.exporter.jaeger.endpoint=http://jaeger:14250 \
         -jar app.jar

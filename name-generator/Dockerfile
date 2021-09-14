FROM amazoncorretto:11-alpine

WORKDIR /app
ADD ./name-generator/build/libs/name-generator-0.0.1-SNAPSHOT.jar app.jar
COPY ./opentelemetry-javaagent-all.jar .

EXPOSE 9090
CMD java -javaagent:opentelemetry-javaagent-all.jar \
         -Dotel.service.name=name-generator \
         -Dotel.traces.exporter=jaeger \
         -Dotel.exporter.jaeger.endpoint=http://jaeger:14250 \
         -jar app.jar

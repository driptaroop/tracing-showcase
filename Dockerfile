FROM gradle:jdk11 as build
MAINTAINER driptaroop.das
WORKDIR /app

COPY first-name-service first-name-service
COPY last-name-service last-name-service
COPY name-generator name-generator
COPY build.gradle.kts .
COPY settings.gradle.kts .
COPY build build

RUN gradle build
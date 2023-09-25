#!/bin/bash

docker compose up -d

./gradlew clean build -x test

java -javaagent:opentelemetry-javaagent.jar \
     -Dotel.resource.attributes=service.name=test-service \
     -Dotel.traces.exporter=jaeger \
     -Dotel.exporter.jaeger.endpoint=http://127.0.0.1:4317 \
     -jar build/libs/cameltrace-0.0.1-SNAPSHOT.jar
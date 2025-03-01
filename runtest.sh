#!/bin/bash

#docker compose down
#docker compose up -d

./gradlew clean build -x test

java -javaagent:opentelemetry-javaagent.jar \
     -Dotel.resource.attributes=service.name=test-service \
     -Dotel.traces.exporter=otlp \
     -Dotel.exporter.otlp.endpoint=http://127.0.0.1:4317 \
     -jar build/libs/cameltrace-0.0.1-SNAPSHOT.jar

#java -javaagent:dd-java-agent-1.20.1.jar \
#     -Ddd.service=camel-trace \
#     -Ddd.env=dev \
#     -Ddd.trace.debug=true \
#     -Ddd.trace.otel.enabled=true \
#     -Ddd.integration.opentelemetry.experimental.enabled=true \
#     -Ddd.otel.exporter.otlp.endpoint=localhost:4317 \
#     -Ddatadog.slf4j.simpleLogger.logFile=logs.txt \
#     -jar build/libs/cameltrace-0.0.1-SNAPSHOT.jar
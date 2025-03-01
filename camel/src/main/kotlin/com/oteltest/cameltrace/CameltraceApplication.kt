package com.oteltest.cameltrace

import org.apache.camel.opentelemetry.starter.CamelOpenTelemetry
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@CamelOpenTelemetry
class CameltraceApplication

fun main(args: Array<String>) {
	runApplication<CameltraceApplication>(*args)
}

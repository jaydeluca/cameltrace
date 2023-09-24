package com.oteltest.cameltrace

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CameltraceApplication

fun main(args: Array<String>) {
	runApplication<CameltraceApplication>(*args)
}

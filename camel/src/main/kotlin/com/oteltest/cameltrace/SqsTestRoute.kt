package com.oteltest.cameltrace

import org.apache.camel.builder.RouteBuilder
import org.springframework.stereotype.Component

@Component
class SqsTestRoute : RouteBuilder() {

    override fun configure() {
        from("aws-sqs://" + queueName + "?amazonSQSClient=#sqsClient&delay=1000")
            .routeId("pulsarRoute")
            .log("Received message: \${body}")

    }
}

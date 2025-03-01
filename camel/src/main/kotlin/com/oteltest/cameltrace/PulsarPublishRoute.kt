package com.oteltest.cameltrace

import org.apache.camel.builder.RouteBuilder
import org.springframework.stereotype.Component

@Component
class PulsarPublishRoute : RouteBuilder() {

    override fun configure() {
        from("timer://pulsarTimer?period=5000")
            .routeId("PublishRoute")
            .setBody(constant("Scheduled message"))
            .to("pulsar:persistent://public/default/my-topic?serviceUrl=pulsar://127.0.0.1:6650")
            .log("Published message to Pulsar: \${body}")
            .end()
    }
}
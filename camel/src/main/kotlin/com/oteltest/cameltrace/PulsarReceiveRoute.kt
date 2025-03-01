package com.oteltest.cameltrace

import org.apache.camel.builder.RouteBuilder
import org.springframework.stereotype.Component

@Component
class PulsarReceiveRoute : RouteBuilder() {

    override fun configure() {
        from("pulsar:persistent://public/default/my-topic?serviceUrl=pulsar://127.0.0.1:6650")
            .routeId("ReceiveRoute")
            .log("Received message: \${body}")
            .end()
    }
}

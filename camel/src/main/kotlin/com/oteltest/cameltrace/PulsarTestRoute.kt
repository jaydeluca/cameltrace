package com.oteltest.cameltrace

import org.apache.camel.builder.RouteBuilder
import org.springframework.stereotype.Component

@Component
class PulsarTestRoute : RouteBuilder() {

    override fun configure() {
        from("pulsar:persistent://public/default/my-topic?serviceUrl=pulsar://127.0.0.1:6650")
            .routeId("pulsarRoute")
            .log("Received message: \${body}")

    }
}

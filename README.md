# Experiment with camel tracing with opentelemetry


Script will setup docker, build jar, start up app with OTel javaagent config

`./runtest.sh`


Tips / Manual:

```
docker compose up -d

# from pulsar bin
./pulsar-client produce persistent://public/default/my-topic -m "test"

# read
./pulsar-client read persistent://public/default/my-topic --queue-size 1

#  rebuild agent
docker compose up -d --build datadog --remove-orphans

```


Notes:

* Access [jaeger](http://localhost:16686/)
* Java 17
* uses otlp and visualizer in jaeger
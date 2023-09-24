

```
docker compose up -d

# from pulsar bin
./pulsar-client produce persistent://public/default/my-topic -m "test"

# read
./pulsar-client read persistent://public/default/my-topic --queue-size 1

```
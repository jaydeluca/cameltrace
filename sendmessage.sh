#!/bin/bash

"$HOME/code/apache-pulsar-3.1.0/bin/pulsar-client" produce persistent://public/default/my-topic -m "test"
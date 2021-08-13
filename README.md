# twm-hazelcast-service Project :: quarkus + hazelcast !!

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Tech Stack:

1. Java 11
2. Quarkus => io.quarkus:quarkus-universe-bom
3. Hazelcast
4. Lombok

## Requirement

1. Download and extract hazelcast zip / tar from https://hazelcast.com/open-source-projects/downloads/#hazelcast-imdg; IMDG - in memory data-grid
2. Generate jar of this package using ```mvn clean install```

## Starting the application locally

1. Start hazelcast from the bin folder of hazelcast-extract ```./start.sh```
2. Start ```./twm-hazelcast-service.sh <provide-cache-ttl-here-in-seconds>``` from terminal

## Stopping application running locally

1. Ctrl + C the terminal where the twm-hazelcast-service jar is running.
2. Stop hazelcast instances from the bin folder of extract ```./stop-all.sh```

## References:

1. https://hazelcast.com/blog/announcing-quarkus-hazelcast-client-integration/
2. https://github.com/hazelcast/quarkus-hazelcast-client
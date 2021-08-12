# twm-hazelcast-service Project :: quarkus + hazelcast !!

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Requirement
1. Download and extract hazelcast zip / tar from https://hazelcast.com/open-source-projects/downloads/#hazelcast-imdg
//IMDG - in memory data grid
2. Install jar of this package using ```mvn clean install```

## Running the application locally
1. Start hazelcast from the bin folder of extract ```./start.sh```
2. Start ```./twm-hazelcast-service.sh <provide-cache-ttl-here>``` from terminal
3. Operations

## Stopping application running locally
1. Ctrl + C the terminal where the jar is running
2. Stop hazelcast instances from the bin folder of extract ```./stop-all.sh```


> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging a
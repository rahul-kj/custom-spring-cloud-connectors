* mvn clean install

* cf cups cassandra-service -p "hosts,username,password"
* cf cups kafka-service -p "url,username,password"

* cf push ccc -p target/custom-spring-cloud-connectors-0.0.1-SNAPSHOT.jar --no-start
* cf bs ccc kafka-service
* cf bs ccc cassandra-service

* curl http://ccc.local.pcfdev.io/csi
* curl http://ccc.local.pcfdev.io/ksi

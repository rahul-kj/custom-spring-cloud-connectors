package com.example.controller;

import org.springframework.cloud.Cloud;
import org.springframework.cloud.CloudFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cassandra.CassandraServiceInfo;
import com.example.kafka.KafkaServiceInfo;

@RestController
public class SampleController {

	@RequestMapping(value = "/csi")
	public CassandraServiceInfo getCassandraServiceInfo() {
		Cloud cloud = new CloudFactory().getCloud();
		CassandraServiceInfo cassandraServiceInfo = (CassandraServiceInfo) cloud.getServiceInfo("cassandra-service");
		System.out.println(cassandraServiceInfo);
		return cassandraServiceInfo;
	}

	@RequestMapping(value = "/ksi")
	public KafkaServiceInfo getKafkaServiceInfo() {
		Cloud cloud = new CloudFactory().getCloud();
		KafkaServiceInfo kafkaServiceInfo = (KafkaServiceInfo) cloud.getServiceInfo("kafka-service");
		System.out.println(kafkaServiceInfo);
		return kafkaServiceInfo;
	}

}

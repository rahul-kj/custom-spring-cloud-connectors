package com.example.kafka;

import java.util.Map;

import org.springframework.cloud.cloudfoundry.CloudFoundryServiceInfoCreator;
import org.springframework.cloud.cloudfoundry.Tags;

public class KafkaServiceInfoCreator extends CloudFoundryServiceInfoCreator<KafkaServiceInfo> {

	public KafkaServiceInfoCreator() {
		super(new Tags(""), "kafka");
	}

	@Override
	public KafkaServiceInfo createServiceInfo(Map<String, Object> serviceData) {
		@SuppressWarnings("unchecked")
		Map<String, Object> credentials = (Map<String, Object>) serviceData.get("credentials");

		String id = (String) serviceData.get("name");
		String url = (String) credentials.get("url");
		String username = (String) credentials.get("username");
		String password = (String) credentials.get("password");

		return new KafkaServiceInfo(id, url, username, password);
	}

	@Override
	public boolean accept(Map<String, Object> serviceData) {
		String name = (String) serviceData.get("name");
		return name.startsWith("kafka");
	}

}
package com.example.cassandra;

import java.util.Map;

import org.springframework.cloud.cloudfoundry.CloudFoundryServiceInfoCreator;
import org.springframework.cloud.cloudfoundry.Tags;

public class CassandraServiceInfoCreator extends CloudFoundryServiceInfoCreator<CassandraServiceInfo> {

	public CassandraServiceInfoCreator() {
		super(new Tags(""), "cassandra");
	}

	@Override
	public CassandraServiceInfo createServiceInfo(Map<String, Object> serviceData) {
		@SuppressWarnings("unchecked")
		Map<String, Object> credentials = (Map<String, Object>) serviceData.get("credentials");

		String id = (String) serviceData.get("name");
		String hosts = (String) credentials.get("hosts");
		String username = (String) credentials.get("username");
		String password = (String) credentials.get("password");

		return new CassandraServiceInfo(id, hosts, username, password);
	}

	@Override
	public boolean accept(Map<String, Object> serviceData) {
		String name = (String) serviceData.get("name");
		return name.startsWith("cassandra");
	}

}
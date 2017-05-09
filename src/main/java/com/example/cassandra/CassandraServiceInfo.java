package com.example.cassandra;

import org.springframework.cloud.service.BaseServiceInfo;

public class CassandraServiceInfo extends BaseServiceInfo {

	public CassandraServiceInfo(String id) {
		super(id);
	}

	public CassandraServiceInfo(String id, String hosts, String username, String password) {
		super(id);
		this.hosts = hosts;
		this.username = username;
		this.password = password;
	}

	private String hosts;
	private String username;
	private String password;

	@ServiceProperty
	public String getHosts() {
		return hosts;
	}

	@ServiceProperty
	public String getUsername() {
		return username;
	}

	@ServiceProperty
	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "CassandraServiceInfo [hosts=" + hosts + ", username=" + username + ", password=" + password + "]";
	}

}

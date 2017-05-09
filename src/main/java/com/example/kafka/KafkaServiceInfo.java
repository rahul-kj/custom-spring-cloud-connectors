package com.example.kafka;

import org.springframework.cloud.service.BaseServiceInfo;

public class KafkaServiceInfo extends BaseServiceInfo {

	public KafkaServiceInfo(String id) {
		super(id);
	}

	public KafkaServiceInfo(String id, String url, String username, String password) {
		super(id);
		this.url = url;
		this.username = username;
		this.password = password;
	}

	private String url;
	private String username;
	private String password;

	@ServiceProperty
	public String getUrl() {
		return url;
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
		return "KafkaServiceInfo [url=" + url + ", username=" + username + ", password=" + password + "]";
	}

}

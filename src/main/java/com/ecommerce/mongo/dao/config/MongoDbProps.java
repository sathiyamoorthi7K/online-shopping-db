package com.ecommerce.mongo.dao.config;

import javax.validation.constraints.NotEmpty;

import org.springframework.validation.annotation.Validated;

@Validated
public class MongoDbProps {
	
	@NotEmpty
	private String uri;
	
	@NotEmpty
	private String dbName;

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
}


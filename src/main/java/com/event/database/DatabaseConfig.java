package com.event.database;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
public class DatabaseConfig extends AbstractMongoConfiguration{

	@Override
	protected String getDatabaseName() {
		return "event";
	}

	@Override
	@Bean
	public Mongo mongo() throws Exception {
//		return new MongoClient("127.0.0.1");
		return new MongoClient("192.168.150.129");
	}
}
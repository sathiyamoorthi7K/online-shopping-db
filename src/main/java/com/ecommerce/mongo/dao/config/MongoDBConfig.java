package com.ecommerce.mongo.dao.config;

import java.time.Clock;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.ecommerce.mongo.dao.contants.MongoConfigConstants;
import com.ecommerce.mongo.dao.converters.BinaryToBsonBinaryConverter;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
@EnableMongoRepositories(basePackages={
	"com.ecommerce.mongo.dao.impl",
	"com.ecommerce.model",
	"com.ecommerce.mongo.dao"
})
public class MongoDBConfig {

	@Bean//(name= "")
	Clock databaseClock() {
		return Clock.systemUTC();
	}

	@Bean(name= MongoConfigConstants.MONGO_CLIENT)
	public MongoClient mongoClient(MongoDbProps mongoDbProps) {
		return MongoClients.create(mongoDbProps.getUri());
	}

	@Bean
	@ConfigurationProperties(prefix= MongoConfigConstants.MONGO_CONFIG_PROPERTY)
	MongoDbProps mongoDbProps() {
		return new MongoDbProps();
	}

	@Bean
	public MongoTemplate mongoTemplate(MongoDbProps mongoDbProps,
			@Qualifier(MongoConfigConstants.MONGO_CLIENT) MongoClient mongoClient,
			@Qualifier(MongoConfigConstants.MONGO_CUSTOM_CONVERSTIONS) MongoCustomConversions mongoCustomConversion) {

		MongoTemplate template = new MongoTemplate(mongoClient, mongoDbProps.getDbName());
		MappingMongoConverter mongoMapping = (MappingMongoConverter) template.getConverter();
		//override to tell mongo to use custom converters
		mongoMapping.setCustomConversions(mongoCustomConversion);
		mongoMapping.afterPropertiesSet();

		return template;

	}

	@Bean(name=MongoConfigConstants.MONGO_CUSTOM_CONVERSTIONS)
	public MongoCustomConversions mongoCustomConversions() {
		return new MongoCustomConversions(Arrays.asList(
				new BinaryToBsonBinaryConverter()
				));
	}


}

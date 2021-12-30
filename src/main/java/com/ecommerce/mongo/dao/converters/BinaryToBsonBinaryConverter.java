package com.ecommerce.mongo.dao.converters;

import org.bson.BsonBinary;
import org.bson.types.Binary;
import org.springframework.core.convert.converter.Converter;

public class BinaryToBsonBinaryConverter implements Converter<Binary, BsonBinary> {

	@Override
	public BsonBinary convert(Binary source) {
		return new BsonBinary(source.getData());
	}
	
}

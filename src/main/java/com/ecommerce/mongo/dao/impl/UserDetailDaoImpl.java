package com.ecommerce.mongo.dao.impl;

import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.userdetail.UserDetail;
import com.ecommerce.mongo.dao.UserDetailRepository;
import com.mongodb.client.result.DeleteResult;

public class UserDetailDaoImpl {
	/*
	 * 
	 * //private final MongoOperations mongoOperations;
	 * 
	 * private final MongoTemplate mongoTemplate;
	 * 
	 * UserDetailDaoImpl(MongoTemplate mongoTemplate) { this.mongoTemplate =
	 * mongoTemplate; }
	 * 
	 * @Override public UserDetail saveUserDetail(UserDetail user) { return
	 * mongoTemplate.save(user, CollectionName.USER_DETAIL); }
	 * 
	 * @Override public UserDetail findByUserId(String userId) { return
	 * mongoTemplate.findByUserId(userId, UserDetail.class); }
	 * 
	 * @Override public DeleteResult deleteByUserId(String userId) { return
	 * mongoOperations.remove(userId); }
	 * 
	 * @Override public List<UserDetail> findAll() { return
	 * mongoOperations.findAll(UserDetail.class); }
	 * 
	 */}

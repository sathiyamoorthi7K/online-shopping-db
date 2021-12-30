package com.ecommerce.mongo.dao.impl;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.constants.CollectionName;
import com.ecommerce.model.userrole.UserRoleDetail;
import com.ecommerce.mongo.dao.UserRoleDetailsDao;

@Repository
public class UserRoleDetailDaoImpl implements UserRoleDetailsDao {
	
	private final MongoOperations mongoOperations;
	
	public UserRoleDetailDaoImpl(MongoOperations mongoOperations) {
		this.mongoOperations = mongoOperations;
	}

	@Override
	public UserRoleDetail saveUserRole(UserRoleDetail userRole) {
		return mongoOperations.save(userRole, CollectionName.USER_ROLE);
	}

	@Override
	public UserRoleDetail findById(String userId) {
		return mongoOperations.findById(userId, UserRoleDetail.class);
	}

}

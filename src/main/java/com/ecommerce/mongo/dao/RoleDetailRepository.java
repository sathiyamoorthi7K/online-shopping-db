package com.ecommerce.mongo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.roledetail.RoleDetail;
import com.ecommerce.model.roledetail.UserRole;

@Repository
@EnableMongoRepositories("com.ecommerce.mongo.dao")
public interface RoleDetailRepository extends MongoRepository<RoleDetail, String> {
	
	//public RoleDetail SaveRoleDetail(RoleDetail roleDetail);
	public RoleDetail findByName(UserRole userRole);

}

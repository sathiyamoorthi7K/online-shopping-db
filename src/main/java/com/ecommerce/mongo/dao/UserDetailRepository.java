package com.ecommerce.mongo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.userdetail.UserDetail;

@Repository
@EnableMongoRepositories("com.ecommerce.mongo.dao")
public interface UserDetailRepository extends MongoRepository<UserDetail, String> {

	@SuppressWarnings("unchecked")
	public UserDetail save(UserDetail userDetail);
	public Optional<UserDetail> findByUserId(String id);
	public void deleteById(String id);
	public List<UserDetail> findAll();
}

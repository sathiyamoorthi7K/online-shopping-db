package com.ecommerce.mongo.dao;

import com.ecommerce.model.userrole.UserRoleDetail;

public interface UserRoleDetailsDao {

	public UserRoleDetail saveUserRole(UserRoleDetail userRole);
	public UserRoleDetail findById(String userId);
}

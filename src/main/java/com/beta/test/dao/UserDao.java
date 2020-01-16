package com.beta.test.dao;

import com.beta.test.entity.User;

public interface UserDao {

	public void registerUser(User user);
	
	public boolean validateUser(User user);
	
}

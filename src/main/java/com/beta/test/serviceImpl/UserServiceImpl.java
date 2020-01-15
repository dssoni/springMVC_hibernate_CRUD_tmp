package com.beta.test.serviceImpl;

import com.beta.test.dao.UserDao;
import com.beta.test.daoImpl.UserDaoImpl;
import com.beta.test.entity.User;
import com.beta.test.service.UserService;

public class UserServiceImpl implements UserService {

	UserDao userDao = new UserDaoImpl();
	
	public void registerUser(User user) {
		userDao.registerUser(user);
	}

}

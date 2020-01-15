package com.beta.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.beta.test.entity.User;
import com.beta.test.service.UserService;
import com.beta.test.serviceImpl.UserServiceImpl;

@Controller
public class NavigationController {

	UserService userService = new UserServiceImpl();
	
	@RequestMapping("/")
	public String tohome() {
		
		userService.registerUser(new User("dhruv","soni","dfs"));
		
		return "homepage";
	}
	
}

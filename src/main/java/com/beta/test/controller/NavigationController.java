package com.beta.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.beta.test.entity.User;
import com.beta.test.service.UserService;
import com.beta.test.serviceImpl.UserServiceImpl;

@Controller
public class NavigationController {

	UserService userService = new UserServiceImpl();

	@RequestMapping("/")
	public String tohome() {

		userService.registerUser(new User("dhruv", "soni", "dfs"));

		return "login";
	}

	@RequestMapping("/validateUser")
	public String validateUser(@ModelAttribute User user) {

		System.out.println(user.getEmail() + " " + user.getPassword() + " " + user.getRole());

		if (userService.validateUser(user)) {

			if (user.getRole().equals("company")) {
				return "companyRegistrationPage";
			}
			return "jobseekerLandingPage";
		}

		return "login";
	}

	@RequestMapping("toregisterUser")
	public String toregisterUser() {
		return "register";
	}

	@RequestMapping("registerUser")
	public String registerUser(@ModelAttribute User user) {

		userService.registerUser(user);
		return "login";
	}

}

package com.eversoft.traverse.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eversoft.traverse.model.User;
import com.eversoft.traverse.model.UserLogin;
import com.eversoft.traverse.model.VisaInformation;
import com.eversoft.traverse.service.UserLoginService;
import com.eversoft.traverse.service.UserService;
import com.eversoft.traverse.service.VisaInformationService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	VisaInformationService visaService;
	
	@Autowired
	UserLoginService userLoginService;
	
	@RequestMapping(value="/get", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public User getUserById(@RequestParam(value="id") int id) {
		User user = userService.getUserById(id);
		user.setVisaInformation(visaService.getVisaInformationById(user.getVisaId()));
		user.setLoginInformation(userLoginService.getUserLoginByIdSecure(user.getLoginId()));
		System.out.println("GET USER: " + user);
		return user;
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean addNewUser(@RequestBody User user) {
		boolean added =  userService.createUser(user);
		System.out.println("NEW USER ADDED? : " + added);
		return added;
	}
	
	@RequestMapping(value="/delete", method = RequestMethod.GET)
	public boolean deleteUserById(@RequestParam(value="id") int id) {
		boolean deleted = userService.deleteUser(id);
		System.out.println("DELETED user with id = " + id + "?: " + deleted);
		return deleted;
	}
	
	@RequestMapping(value="/getall", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<User> getAllUsers() {
		List<User> list = userService.getAllUsers();
		System.out.println("User List: " + list);
		return list;
	}
	
	@RequestMapping(value="/update", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean updateUser(@RequestBody User user, @RequestParam(value="id") int id) {
		boolean updated =  userService.updateUser(id, user);
		System.out.println("USER updated? : " + updated);
		return updated;
	}
	
	
}

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
import com.eversoft.traverse.service.AuthService;
import com.eversoft.traverse.service.UserLoginService;
import com.eversoft.traverse.service.UserService;
import com.eversoft.traverse.service.VisaInformationService;
import com.eversoft.traverse.utility.JsonFormatter;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	VisaInformationService visaService;
	
	@Autowired
	UserLoginService userLoginService;
	
	@Autowired
	AuthService authService;
	
	@RequestMapping(value="/get", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public User getUserById(@RequestParam(value="id") int id, @RequestParam(value="key") String key) {
		if(authService.isValidAPIKey(key)) {
			User user = userService.getUserById(id);
			user.setVisaInformation(visaService.getVisaInformationById(user.getVisaId()));
			user.setLoginInformation(userLoginService.getUserLoginById(user.getLoginId()));
			System.out.println("GET USER: " + user);
			return user;
		}else {
			return null;
		}
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean addNewUser(@RequestBody User user, @RequestParam(value="key") String key) {
		if(authService.isValidAPIKey(key)) {
			boolean added =  userService.createUser(user);
			System.out.println("NEW USER ADDED? : " + added);
			return added;
		}else {
			return false;
		}
	}
	
	@RequestMapping(value="/delete", method = RequestMethod.GET)
	public boolean deleteUserById(@RequestParam(value="id") int id, @RequestParam(value="key") String key) {
		if(authService.isValidAPIKey(key)) {
			boolean deleted = userService.deleteUser(id);
			System.out.println("DELETED user with id = " + id + "?: " + deleted);
			return deleted;
		}else {
			return false;
		}
	}
	
	@RequestMapping(value="/getall", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<User> getAllUsers(@RequestParam(value="key") String key) {
		if(authService.isValidAPIKey(key)) {
			List<User> list = userService.getAllUsers();
			System.out.println("User List: " + list);
			return list;
		}else {
			return null;
		}
	}
	
	@RequestMapping(value="/update", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean updateUser(@RequestBody User user, @RequestParam(value="id") int id, @RequestParam(value="key") String key) {
		if(authService.isValidAPIKey(key)) {
			boolean updated =  userService.updateUser(id, user);
			System.out.println("USER updated? : " + updated);
			return updated;
		}else {
			return false;
		}
	}
	
	
}

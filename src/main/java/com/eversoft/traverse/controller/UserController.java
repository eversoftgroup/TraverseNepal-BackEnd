package com.eversoft.traverse.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eversoft.traverse.model.User;
import com.eversoft.traverse.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/adddummyvalue", method = RequestMethod.GET)
	public String addUserDummy(Model model) {
		
		User dummyUser = new User();
		dummyUser.setDateOfBirth(new Date());
		dummyUser.setFirstName("Bikalpa");
		dummyUser.setLastName("Dhakal");
		dummyUser.setMiddleName("Raj");
		dummyUser.setNationality("Nepalese");
		dummyUser.setVisaId(22);
		
		userService.createUser(dummyUser);
		
		return "home";
	}
}

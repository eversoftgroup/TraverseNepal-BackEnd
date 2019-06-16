package com.eversoft.traverse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eversoft.traverse.model.User;
import com.eversoft.traverse.model.VisaInformation;
import com.eversoft.traverse.service.UserLoginService;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

	@Autowired
	UserLoginService userLoginService;
	
	@RequestMapping(value="/login", method = RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public String getUserById(@RequestParam(value="username") String username, @RequestParam(value="password") String passwordHash) {
		// TODO login logic
		return "home";
	}
}

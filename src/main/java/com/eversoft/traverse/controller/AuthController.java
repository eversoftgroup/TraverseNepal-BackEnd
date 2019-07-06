package com.eversoft.traverse.controller;

import com.eversoft.traverse.misc.enums.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eversoft.traverse.model.User;
import com.eversoft.traverse.model.VisaInformation;
import com.eversoft.traverse.service.AuthService;
import com.eversoft.traverse.service.UserLoginService;
import com.eversoft.traverse.service.UserRegisterService;
import com.eversoft.traverse.service.VisaInformationService;
import com.eversoft.traverse.service.UserLoginService;
import com.eversoft.traverse.utility.StringUtils;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	UserLoginService userLoginService;
	
	@Autowired
	UserRegisterService userRegisterService;
	
	@Autowired
	VisaInformationService visaInformationService;
	
	@Autowired
	AuthService authService;
	
	@RequestMapping(value="/login", method = RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public String getUserById(@RequestParam(value="username") String username, @RequestParam(value="password") String passwordHash) {
		switch(authService.doLogin(username, passwordHash)) {
		case AUTH_FAILURE_CREDENTIALS_ERROR:
			System.out.println("CR. Error");
			break;
		case AUTH_SUCCESS:
			String key = StringUtils.generateRandomKey();
			userLoginService.updateKey(username, key);
			System.out.println("Inside /login auth");
//			return key;
			return "{\"message\": \""+ key +"\"}";
		default:
			System.out.println("Case Default");
			break;
		}
		return "{\"message\": \"-1\"}";
//		return "-1";
	}
	
	@RequestMapping(value="/register", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Boolean userRegister(@RequestBody User user) {
		System.out.println(user);
		boolean userAdded =  userRegisterService.createUserRegister(user);
		boolean visaInfoAdded =  visaInformationService.createVisaInformation(user.getVisaInformation());
		boolean loginInfoAdded =  userLoginService.createUserLogin(user.getLoginInformation());
		
		return userAdded && visaInfoAdded && loginInfoAdded;
	}
}

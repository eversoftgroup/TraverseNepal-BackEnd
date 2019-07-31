package com.eversoft.traverse.controller;

import com.eversoft.traverse.misc.enums.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eversoft.traverse.model.User;
import com.eversoft.traverse.model.VisaInformation;
import com.eversoft.traverse.service.AuthService;
import com.eversoft.traverse.service.UserLoginService;
import com.eversoft.traverse.utility.StringUtils;
import com.eversoft.traverse.utility.JsonFormatter;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	UserLoginService userLoginService;
	
	@Autowired
	AuthService authService;
	
	@RequestMapping(value="/login", method = RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public String getUserById(@RequestParam(value="username") String username, @RequestParam(value="password") String passwordHash) {
		switch(authService.doLogin(username, passwordHash)) {
		case AUTH_FAILURE_CREDENTIALS_ERROR:
			break;
		case AUTH_SUCCESS:
			String key = StringUtils.generateRandomKey();
			userLoginService.updateKey(username, key);
			System.out.println("user login called! :)");
			return JsonFormatter.FormatJson("message", key);
		}
		return JsonFormatter.FormatJson("message", "-1");
		
	}
}

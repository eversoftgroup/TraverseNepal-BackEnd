package com.eversoft.traverse.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eversoft.traverse.dao.UserLoginDao;
import com.eversoft.traverse.misc.enums.AuthStatus;
import com.eversoft.traverse.model.UserLogin;
import com.eversoft.traverse.service.AuthService;
import com.eversoft.traverse.utility.StringUtils;

@Service
public class AuthServiceImpl implements AuthService {

	@Autowired
	UserLoginDao userLoginDao;
	
	@Override
	public AuthStatus doLogin(String username, String passwordHash) {
		UserLogin userLogin;
		if(StringUtils.isEmail(username)) {
			userLogin = userLoginDao.getUserLoginByEmail(username);
		}else {
			userLogin = userLoginDao.getUserLoginByUsername(username);
		}
		if(userLogin == null) {
			return AuthStatus.AUTH_FAILURE_USER_DOESNOT_EXIST;
		}else {
			if(userLogin.getPasswordHash().equals(passwordHash)) {
				return AuthStatus.AUTH_SUCCESS;
			}else {
				return AuthStatus.AUTH_FAILURE_CREDENTIALS_ERROR;
			}
		}
	}

	@Override
	public boolean isValidAPIKey(String key) {
		return userLoginDao.isValidAPIKey(key);
	}

}

package com.eversoft.traverse.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eversoft.traverse.dao.UserLoginDao;
import com.eversoft.traverse.model.User;
import com.eversoft.traverse.model.UserLogin;
import com.eversoft.traverse.service.UserLoginService;
import com.eversoft.traverse.utility.StringUtils;

@Service
public class UserLoginServiceImpl implements UserLoginService{

	@Autowired
	UserLoginDao userLoginDao;
	
	public UserLoginServiceImpl() {

	}
	
	@Override
	public boolean createUserLogin(UserLogin userLogin) {
		return userLoginDao.createUserLogin(userLogin);
	}

	@Override
	public UserLogin getUserLoginById(int id) {
		return userLoginDao.getUserLoginById(id);
	}

	@Override
	public boolean deleteUserLogin(int id) {
		return userLoginDao.deleteUserLogin(id);
	}

	@Override
	public boolean updateUserLogin(int id, UserLogin userLogin) {
		return userLoginDao.updateUserLogin(id, userLogin);
	}

	@Override
	public UserLogin getUserLoginByIdSecure(int id) {
		UserLogin userLogin = userLoginDao.getUserLoginById(id);
		userLogin.setPasswordHash(null);
		userLogin.setPasswordSalt(null);
		userLogin.setApiKey(null);
		return userLogin;
	}

	@Override
	public boolean updateKey(String username, String key) {
		UserLogin userLogin;
		if(StringUtils.isEmail(username)) {
			userLogin = userLoginDao.getUserLoginByEmail(username);
		}else {
			userLogin = userLoginDao.getUserLoginByUsername(username);
		}
		userLogin.setApiKey(key);
		userLoginDao.updateUserLogin(userLogin.getId(), userLogin);
		return false;
	}

}

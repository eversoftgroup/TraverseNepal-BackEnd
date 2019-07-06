package com.eversoft.traverse.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eversoft.traverse.dao.UserRegisterDao;
import com.eversoft.traverse.model.User;
import com.eversoft.traverse.service.UserRegisterService;

@Service
public class UserRegisterServiceimpl implements UserRegisterService {
	
	@Autowired
	UserRegisterDao userRegisterDao;

	public UserRegisterServiceimpl() {
	}

	@Override
	public boolean createUserRegister(User user) {
		return userRegisterDao.createUserRegister(user);
	}

	@Override
	public User getUserRegisterById(int id) {
		return null;
	}

	@Override
	public boolean deleteUserRegister(int id) {
		return false;
	}

	@Override
	public boolean updateUserRegister(int id, User user) {
		return false;
	}

}

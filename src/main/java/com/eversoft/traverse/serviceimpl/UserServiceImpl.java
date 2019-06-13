package com.eversoft.traverse.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eversoft.traverse.dao.UserDao;
import com.eversoft.traverse.model.User;
import com.eversoft.traverse.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	public UserServiceImpl() {

	}
	
	@Override
	public void createUser(User user) {
		userDao.createUser(user);
	}

}

package com.eversoft.traverse.serviceimpl;

import java.util.List;

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
	public boolean createUser(User user) {
		return userDao.createUser(user);
	}

	@Override
	public User getUserById(int id) {
		return userDao.getUserById(id);
	}

	@Override
	public boolean deleteUser(int id) {
		return userDao.deleteUser(id);
	}

	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	@Override
	public boolean updateUser(int id, User user) {
		return userDao.updateUser(id, user);
	}

}

package com.eversoft.traverse.Serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eversoft.traverse.Dao.UserDao;
import com.eversoft.traverse.Model.User;
import com.eversoft.traverse.Service.UserService;

@Service
public class UserServiceimpl implements UserService {

	@Autowired
	UserDao userDao;
	
	public UserServiceimpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean createUser(User User) {
		return userDao.createUser(User);
	}

	@Override
	public boolean deleteUser(int id) {
		return userDao.deleteUser(id);
	}

	@Override
	public List<User> getAllUser() {
		return userDao.getAllUser();
	}

	@Override
	public boolean updateUser(int id, User User) {
		return userDao.updateUser(id, User);
	}

	@Override
	public User getUserById(int id) {
		return userDao.getUserById(id);
	}

}

package com.eversoft.traverse.service;

import java.util.List;

import com.eversoft.traverse.model.User;
import com.eversoft.traverse.model.UserLogin;

public interface UserService {
	public boolean createUser(User user);
	public User getUserById(int id);
	public boolean deleteUser(int id);
	public List<User> getAllUsers();
	public boolean updateUser(int id, User user);
}

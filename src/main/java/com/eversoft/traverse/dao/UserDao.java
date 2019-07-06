package com.eversoft.traverse.dao;

import java.util.List;

import com.eversoft.traverse.model.User;

public interface UserDao {
	public boolean createUser(User user);
	public User getUserById(int id);
	public boolean deleteUser(int id);
	public List<User> getAllUsers();
	public boolean updateUser(int id, User user);
}

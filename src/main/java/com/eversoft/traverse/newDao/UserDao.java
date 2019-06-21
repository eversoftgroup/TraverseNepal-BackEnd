package com.eversoft.traverse.newDao;

import java.util.List;

import com.eversoft.traverse.newModel.User;

public interface UserDao {
	public boolean createUser(User User);
	public boolean deleteUser(int id);
	public List<User> getAllUser();
	public boolean updateUser(int id, User User);
	public User getUserById(int id);
}
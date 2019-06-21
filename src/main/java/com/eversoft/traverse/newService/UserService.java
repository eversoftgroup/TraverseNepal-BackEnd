package com.eversoft.traverse.newService;

import java.util.List;

import com.eversoft.traverse.newModel.User;

public interface UserService {
	public boolean createUser(User User);
	public boolean deleteUser(int id);
	public List<User> getAllUser();
	public boolean updateUser(int id, User User);
	public User getUserById(int id);
	
	
}

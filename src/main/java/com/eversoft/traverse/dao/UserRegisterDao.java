package com.eversoft.traverse.dao;

import com.eversoft.traverse.model.User;

public interface UserRegisterDao {
	public boolean createUserRegister(User user);
	public User getUserRegisterById(int id);
	public boolean deleteUserRegister(int id);
	public boolean updateUserRegister(int id, User user);

}

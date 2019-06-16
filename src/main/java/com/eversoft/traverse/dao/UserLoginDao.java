package com.eversoft.traverse.dao;

import java.util.List;

import com.eversoft.traverse.model.User;
import com.eversoft.traverse.model.UserLogin;

public interface UserLoginDao {
	public boolean createUserLogin(UserLogin user);
	public UserLogin getUserLoginById(int id);
	public boolean deleteUserLogin(int id);
	public boolean updateUserLogin(int id, UserLogin userLogin);
}

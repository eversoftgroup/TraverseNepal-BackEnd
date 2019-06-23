package com.eversoft.traverse.Dao;

import java.util.List;

import com.eversoft.traverse.Model.MyPick;

public interface MyPickDao {
	public boolean createMyPick(MyPick MyPick);
	public boolean deleteMyPick(int id);
	public List<MyPick> getAllMyPick();
	public boolean updateMyPick(int id, MyPick MyPick);
	public MyPick getMyPickById(int id);
}
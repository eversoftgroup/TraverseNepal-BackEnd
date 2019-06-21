package com.eversoft.traverse.newDao;

import java.util.List;

import com.eversoft.traverse.newModel.MyPick;

public interface MyPickDao {
	public boolean createMyPick(MyPick MyPick);
	public boolean deleteMyPick(int id);
	public List<MyPick> getAllMyPick();
	public boolean updateMyPick(int id, MyPick MyPick);
	public MyPick getMyPickById(int id);
}
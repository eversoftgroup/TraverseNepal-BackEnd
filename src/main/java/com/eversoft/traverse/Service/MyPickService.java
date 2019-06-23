package com.eversoft.traverse.Service;

import java.util.List;

import com.eversoft.traverse.Model.MyPick;

public interface MyPickService {
	public boolean createMyPick(MyPick MyPick);
	public boolean deleteMyPick(int id);
	public List<MyPick> getAllMyPick();
	public boolean updateMyPick(int id, MyPick MyPick);
	public MyPick getMyPickById(int id);
}

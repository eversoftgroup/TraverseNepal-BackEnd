package com.eversoft.traverse.newService;

import java.util.List;

import com.eversoft.traverse.newModel.MyPick;

public interface MyPickService {
	public boolean createMyPick(MyPick MyPick);
	public boolean deleteMyPick(int id);
	public List<MyPick> getAllMyPick();
	public boolean updateMyPick(int id, MyPick MyPick);
	public MyPick getMyPickById(int id);
}

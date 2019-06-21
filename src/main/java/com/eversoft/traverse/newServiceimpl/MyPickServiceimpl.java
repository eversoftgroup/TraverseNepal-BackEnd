package com.eversoft.traverse.newServiceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eversoft.traverse.newDao.MyPickDao;
import com.eversoft.traverse.newModel.MyPick;
import com.eversoft.traverse.newService.MyPickService;

@Service
public class MyPickServiceimpl implements MyPickService {

	@Autowired
	MyPickDao myPickDao;
	
	public MyPickServiceimpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean createMyPick(MyPick MyPick) {
		return myPickDao.createMyPick(MyPick);
	}

	@Override
	public boolean deleteMyPick(int id) {
		return myPickDao.deleteMyPick(id);
	}

	@Override
	public List<MyPick> getAllMyPick() {
		return myPickDao.getAllMyPick();
	}

	@Override
	public boolean updateMyPick(int id, MyPick MyPick) {
		return myPickDao.updateMyPick(id, MyPick);
	}

	@Override
	public MyPick getMyPickById(int id) {
		return myPickDao.getMyPickById(id);
	}

}

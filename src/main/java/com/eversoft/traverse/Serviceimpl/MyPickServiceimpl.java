package com.eversoft.traverse.Serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eversoft.traverse.Dao.MyPickDao;
import com.eversoft.traverse.Model.MyPick;
import com.eversoft.traverse.Service.MyPickService;

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

package com.eversoft.traverse.newServiceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eversoft.traverse.newDao.EmergencyContactDao;
import com.eversoft.traverse.newModel.EmergencyContact;
import com.eversoft.traverse.newService.EmergencyContactService;

@Service
public class EmergencyContactServiceimpl implements EmergencyContactService {
	
	@Autowired
	EmergencyContactDao emergencyContactDao;

	public EmergencyContactServiceimpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean createContact(EmergencyContact Contact) {
		return emergencyContactDao.createContact(Contact);
	}

	@Override
	public boolean deleteContact(int id) {
		return emergencyContactDao.deleteContact(id);
	}

	@Override
	public List<EmergencyContact> getAllContact() {
		return emergencyContactDao.getAllContact();
	}

	@Override
	public boolean updateContact(int id, EmergencyContact Contact) {
		return emergencyContactDao.updateContact(id, Contact);
	}

	@Override
	public EmergencyContact getContactById(int id) {
		return emergencyContactDao.getContactById(id);
	}

}

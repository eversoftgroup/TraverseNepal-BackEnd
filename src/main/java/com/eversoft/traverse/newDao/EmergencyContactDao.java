package com.eversoft.traverse.newDao;

import java.util.List;

import com.eversoft.traverse.newModel.EmergencyContact;

public interface EmergencyContactDao {
	public boolean createContact(EmergencyContact Contact);
	public boolean deleteContact(int id);
	public List<EmergencyContact> getAllContact();
	public boolean updateContact(int id, EmergencyContact Contact);
	public EmergencyContact getContactById(int id);
}

package com.eversoft.traverse.Service;

import java.util.List;

import com.eversoft.traverse.Model.EmergencyContact;

public interface EmergencyContactService {
	public boolean createContact(EmergencyContact Contact);
	public boolean deleteContact(int id);
	public List<EmergencyContact> getAllContact();
	public boolean updateContact(int id, EmergencyContact Contact);
	public EmergencyContact getContactById(int id);
}

package com.eversoft.traverse.dao;

import java.util.List;

import com.eversoft.traverse.model.User;
import com.eversoft.traverse.model.VisaInformation;

public interface VisaInformationDao {
	public boolean createVisaInformation(VisaInformation visaInformation);
	public VisaInformation getVisaInformationById(int id);
	public boolean deleteVisaInformation(int id);
	public List<VisaInformation> getAllVisaInformations();
	public boolean updateVisaInformation(int id, VisaInformation visaInformation);
}

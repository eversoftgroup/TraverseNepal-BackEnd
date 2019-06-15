package com.eversoft.traverse.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eversoft.traverse.dao.UserDao;
import com.eversoft.traverse.dao.VisaInformationDao;
import com.eversoft.traverse.model.User;
import com.eversoft.traverse.model.VisaInformation;
import com.eversoft.traverse.service.UserService;
import com.eversoft.traverse.service.VisaInformationService;

@Service
public class VisaInformationServiceImpl implements VisaInformationService{

	@Autowired
	VisaInformationDao visaInformationDao;
	
	public VisaInformationServiceImpl() {

	}
	
	@Override
	public boolean createVisaInformation(VisaInformation visaInformation) {
		return visaInformationDao.createVisaInformation(visaInformation);
	}

	@Override
	public VisaInformation getVisaInformationById(int id) {
		return visaInformationDao.getVisaInformationById(id);
	}

	@Override
	public boolean deleteVisaInformation(int id) {
		return visaInformationDao.deleteVisaInformation(id);
	}

	@Override
	public List<VisaInformation> getAllVisaInformations() {
		return visaInformationDao.getAllVisaInformations();
	}

	@Override
	public boolean updateVisaInformation(int id, VisaInformation visaInformation) {
		return visaInformationDao.updateVisaInformation(id, visaInformation);
	}

}

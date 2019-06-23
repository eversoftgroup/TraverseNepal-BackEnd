package com.eversoft.traverse.Serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eversoft.traverse.Dao.GeneralGuideDao;
import com.eversoft.traverse.Dao.MediaDao;
import com.eversoft.traverse.Model.GeneralGuide;
import com.eversoft.traverse.Model.Media;
import com.eversoft.traverse.Service.GeneralGuideService;

@Service
public class GeneralGuideServiceimpl implements GeneralGuideService {

	public GeneralGuideServiceimpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	GeneralGuideDao generalGuideDao;
	
	@Autowired
	MediaDao mediaDao;

	@Override
	public boolean createGuide(GeneralGuide Guide) {
		return generalGuideDao.createGuide(Guide);
	}

	@Override
	public boolean deleteGuide(int id) {
		return generalGuideDao.deleteGuide(id);
	}

	@Override
	public List<GeneralGuide> getAllGuide() {
		return generalGuideDao.getAllGuide();
	}

	@Override
	public boolean updateGuide(int id, GeneralGuide Guide) {
		return generalGuideDao.updateGuide(id, Guide);
	}

	@Override
	public GeneralGuide getGuideById(int id) {
		return generalGuideDao.getGuideById(id);
	}

	@Override
	public boolean createMedia(Media Media) {
		return mediaDao.createMedia(Media);
	}

	@Override
	public boolean deleteMedia(int id) {
		return mediaDao.deleteMedia(id);
	}

	@Override
	public boolean updateMedia(int id, Media Media) {
		return mediaDao.updateMedia(id, Media);
	}

	@Override
	public Media getMediaById(int id) {
		return mediaDao.getMediaById(id);
	}

}

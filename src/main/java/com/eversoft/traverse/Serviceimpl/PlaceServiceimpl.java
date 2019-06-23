package com.eversoft.traverse.Serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eversoft.traverse.Dao.MediaDao;
import com.eversoft.traverse.Dao.PlaceDao;
import com.eversoft.traverse.Model.Media;
import com.eversoft.traverse.Model.Place;
import com.eversoft.traverse.Service.PlaceService;

@Service
public class PlaceServiceimpl implements PlaceService {
	
	@Autowired
	PlaceDao placeDao;
	
	@Autowired
	MediaDao mediaDao;

	public PlaceServiceimpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean createPlace(Place Place) {
		return placeDao.createPlace(Place);
	}

	@Override
	public boolean deletePlace(int id) {
		return placeDao.deletePlace(id);
	}

	@Override
	public List<Place> getAllPlace() {
		return placeDao.getAllPlace();
	}

	@Override
	public boolean updatePlace(int id, Place Place) {
		return placeDao.updatePlace(id, Place);
	}

	@Override
	public Place getPlaceById(int id) {
		return placeDao.getPlaceById(id);
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

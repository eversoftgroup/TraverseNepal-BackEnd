package com.eversoft.traverse.newService;

import java.util.List;

import com.eversoft.traverse.newModel.Media;
import com.eversoft.traverse.newModel.Place;

public interface PlaceService {
	public boolean createPlace(Place Place);
	public boolean deletePlace(int id);
	public List<Place> getAllPlace();
	public boolean updatePlace(int id, Place Place);
	public Place getPlaceById(int id);
	
	public boolean createMedia(Media Media);
	public boolean deleteMedia(int id);
//	public List<Media> getAllMedia();
	public boolean updateMedia(int id, Media Media);
	public Media getMediaById(int id);
}

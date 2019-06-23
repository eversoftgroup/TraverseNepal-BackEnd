package com.eversoft.traverse.Service;

import java.util.List;

import com.eversoft.traverse.Model.Media;
import com.eversoft.traverse.Model.Place;

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

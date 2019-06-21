package com.eversoft.traverse.newDao;

import java.util.List;

import com.eversoft.traverse.newModel.Place;

public interface PlaceDao {
	public boolean createPlace(Place Place);
	public boolean deletePlace(int id);
	public List<Place> getAllPlace();
	public boolean updatePlace(int id, Place Place);
	public Place getPlaceById(int id);
}
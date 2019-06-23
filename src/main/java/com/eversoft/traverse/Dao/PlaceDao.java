package com.eversoft.traverse.Dao;

import java.util.List;

import com.eversoft.traverse.Model.Place;

public interface PlaceDao {
	public boolean createPlace(Place Place);
	public boolean deletePlace(int id);
	public List<Place> getAllPlace();
	public boolean updatePlace(int id, Place Place);
	public Place getPlaceById(int id);
}
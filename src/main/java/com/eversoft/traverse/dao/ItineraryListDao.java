package com.eversoft.traverse.dao;

import java.util.List;

import com.eversoft.traverse.model.Itinerary;

public interface ItineraryListDao {
	public boolean createItinerary(Itinerary itinerary);
	public boolean deleteItinerary(int id);
	public List<Itinerary> getAllItinerary();
	public boolean updateItinerary(int id, Itinerary itinerary);
}

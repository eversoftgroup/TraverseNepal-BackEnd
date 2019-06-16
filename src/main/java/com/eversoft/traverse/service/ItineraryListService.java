package com.eversoft.traverse.service;

import java.util.List;

import com.eversoft.traverse.model.Itinerary;

public interface ItineraryListService {
	public boolean createItinerary(Itinerary itinerary);
	public boolean deleteItinerary(int id);
	public List<Itinerary> getAllItinerary();
	public boolean updateItinerary(int id, Itinerary itinerary);
	public Itinerary getItineraryById(int id);
}

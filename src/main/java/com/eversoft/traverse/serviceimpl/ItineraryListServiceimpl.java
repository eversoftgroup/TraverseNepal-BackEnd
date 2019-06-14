package com.eversoft.traverse.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eversoft.traverse.dao.ItineraryListDao;
import com.eversoft.traverse.model.Itinerary;
import com.eversoft.traverse.service.ItineraryListService;

@Service
public class ItineraryListServiceimpl implements ItineraryListService{
	
	@Autowired
	ItineraryListDao itineraryListDao;
	
	public ItineraryListServiceimpl() {

	}
	
	@Override
	public boolean createItinerary(Itinerary itinerary) {
		return itineraryListDao.createItinerary(itinerary);
	}

	@Override
	public boolean deleteItinerary(int id) {
		return itineraryListDao.deleteItinerary(id);
	}

	@Override
	public List<Itinerary> getAllItinerary() {
		return itineraryListDao.getAllItinerary();
	}

	@Override
	public boolean updateItinerary(int id, Itinerary itinerary) {
		return itineraryListDao.updateItinerary(id, itinerary);
	}

}

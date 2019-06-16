package com.eversoft.traverse.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eversoft.traverse.model.User;
import com.eversoft.traverse.model.Itinerary;
import com.eversoft.traverse.service.UserService;
import com.eversoft.traverse.service.ItineraryListService;

@RestController
@RequestMapping("/itinerary")
public class ItineraryListController {
	
	@Autowired
	ItineraryListService itineraryListService;
	
	@RequestMapping(value="/getall", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Itinerary> getAllItinerary() {
		List<Itinerary> list = itineraryListService.getAllItinerary();
		System.out.println("Itinerary List: " + list);
		return list;
	}
	
	@RequestMapping(value="/update", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean updateUser(@RequestBody Itinerary itinerary, @RequestParam(value="id") int id) {
		boolean updated =  itineraryListService.updateItinerary(id, itinerary);
		System.out.println("Itinerary updated? : " + updated);
		return updated;
	}
	
	@RequestMapping(value="/delete", method = RequestMethod.GET)
	public boolean deleteUserById(@RequestParam(value="id") int id) {
		boolean deleted = itineraryListService.deleteItinerary(id);
		System.out.println("DELETED Itinerary with id = " + id + "?: " + deleted);
		return deleted;
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean addNewUser(@RequestBody Itinerary itinerary) {
		boolean added =  itineraryListService.createItinerary(itinerary);
		System.out.println("NEW Itinerary ADDED? : " + added);
		return added;
	}
	
	@RequestMapping(value="/get", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Itinerary getItineraryById(@RequestParam(value="id") int id) {
		Itinerary itinerary = itineraryListService.getItineraryById(id);
		System.out.println("GET Itinerary: " + itinerary);
		return itinerary;
	}
}

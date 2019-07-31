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
import com.eversoft.traverse.service.AuthService;
import com.eversoft.traverse.service.ItineraryListService;

@RestController
@RequestMapping("/itinerary")
public class ItineraryListController {
	
	@Autowired
	ItineraryListService itineraryListService;
	
	@Autowired
	AuthService authService;
	
	@RequestMapping(value="/getall", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Itinerary> getAllItinerary(@RequestParam(value="id") int id,@RequestParam(value="key") String key) {
		if(authService.isValidAPIKey(key)) {
			List<Itinerary> list = itineraryListService.getAllItinerary(id);
			System.out.println("Itinerary List: " + list);
			return list;
		}else {
			return null;
		}
	}
	
	@RequestMapping(value="/update", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean updateUser(@RequestBody Itinerary itinerary, @RequestParam(value="id") int id, @RequestParam(value="key") String key) {
		if(authService.isValidAPIKey(key)) {
			boolean updated =  itineraryListService.updateItinerary(id, itinerary);
			System.out.println("Itinerary updated? : " + updated);
			return updated;
		}else {
			return false;
		}
	}
	
	@RequestMapping(value="/delete", method = RequestMethod.GET)
	public boolean deleteUserById(@RequestParam(value="id") int id, @RequestParam(value="key") String key) {
		if(authService.isValidAPIKey(key)) {
			boolean deleted = itineraryListService.deleteItinerary(id);
			System.out.println("DELETED Itinerary with id = " + id + "?: " + deleted);
			return deleted;
		}else {
			return false;
		}
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean addNewUser(@RequestBody Itinerary itinerary, @RequestParam(value="key") String key) {
		if(authService.isValidAPIKey(key)) {
			boolean added =  itineraryListService.createItinerary(itinerary);
			System.out.println("NEW Itinerary ADDED? : " + added);
			return added;
		}else {
			return false;
		}
	}
	
	@RequestMapping(value="/get", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Itinerary getItineraryById(@RequestParam(value="id") int id, @RequestParam(value="key") String key) {
		if(authService.isValidAPIKey(key)) {
			Itinerary itinerary = itineraryListService.getItineraryById(id);
			System.out.println("GET Itinerary: " + itinerary);
			return itinerary;
		}else {
			return null;
		}
	}
}

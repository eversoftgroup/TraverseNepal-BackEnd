package com.eversoft.traverse.model;

public class Itinerary {
	private int id;
	private String name;
	private double allocatedBudget;
	private int priorityID;
	private String placeName;
	private int locationId;
	private int userId;
	public String description;
	
	public Itinerary() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAllocatedBudget() {
		return allocatedBudget;
	}

	public void setAllocatedBudget(double allocatedBudget) {
		this.allocatedBudget = allocatedBudget;
	}

	public int getPriorityID() {
		return priorityID;
	}

	public void setPriorityID(int priorityID) {
		this.priorityID = priorityID;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}

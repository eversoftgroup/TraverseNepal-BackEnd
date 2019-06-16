package com.eversoft.traverse.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="itinerary")
public class Itinerary implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="allocatedBudget")
	private double allocatedBudget;
	
	@Column(name="priorityID")
	private int priorityID;
	
	@Column(name="placeName")
	private String placeName;
	
	@Column(name="locationId")
	private int locationId;
	
	@Column(name="userId")
	private int userId;
	
	@Column(name="description")
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
	

	@Override
	public String toString() {
		return "ItineraryList [id=" + id + ", name=" + name + ", allocatedBudget=" + allocatedBudget + ", priorityID=" + priorityID
				+ ", placeName=" + placeName + ", locationId=" + locationId + ", userId=" + userId + ", description=" + description +"]";
	}
	
	
}

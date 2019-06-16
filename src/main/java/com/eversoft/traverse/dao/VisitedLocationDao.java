package com.eversoft.traverse.dao;

import java.util.List;

import com.eversoft.traverse.model.VisitedLocation;

public interface VisitedLocationDao {
	public boolean createVisitedLocation(VisitedLocation VisitedLocation);
	public boolean deleteVisitedLocation(int id);
	public List<VisitedLocation> getAllVisitedLocation(int userId);
	public boolean updateVisitedLocation(int id, VisitedLocation VisitedLocation);
	public VisitedLocation getVisitedLocationById(int id);
}

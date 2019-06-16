package com.eversoft.traverse.dao;

import java.util.List;

import com.eversoft.traverse.model.Location;

public interface LocationDao {
	public boolean createLocation(Location location);
	public boolean deleteLocation(int id);
	public List<Location> getAllLocation();
	public boolean updateLocation(int id, Location location);
	public Location getLocationById(int id);
}

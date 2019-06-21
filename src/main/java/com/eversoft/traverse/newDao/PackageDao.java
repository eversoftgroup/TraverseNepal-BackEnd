package com.eversoft.traverse.newDao;

import java.util.List;

import com.eversoft.traverse.newModel.Package;

public interface PackageDao {
	public boolean createPackage(Package Package);
	public boolean deletePackage(int id);
	public List<Package> getAllPackage();
	public boolean updatePackage(int id, Package Package);
	public Package getPackageById(int id);
}
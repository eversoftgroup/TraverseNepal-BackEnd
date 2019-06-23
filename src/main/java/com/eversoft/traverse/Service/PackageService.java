package com.eversoft.traverse.Service;

import java.util.List;

import com.eversoft.traverse.Model.Category;
import com.eversoft.traverse.Model.Package;

public interface PackageService {
	public boolean createPackage(Package Package);
	public boolean deletePackage(int id);
	public List<Package> getAllPackage();
	public boolean updatePackage(int id, Package Package);
	public Package getPackageById(int id);
	
	public boolean createCategory(Category category);
	public boolean deleteCategory(int id);
	public List<Category> getAllCategory();
	public boolean updateCategory(int id, Category category);
	public Category getCategoryById(int id);
}

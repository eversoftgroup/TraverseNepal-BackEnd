package com.eversoft.traverse.newServiceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eversoft.traverse.newDao.CategoryDao;
import com.eversoft.traverse.newDao.PackageDao;
import com.eversoft.traverse.newModel.Category;
import com.eversoft.traverse.newModel.Package;
import com.eversoft.traverse.newService.PackageService;

@Service
public class PackageServiceimpl implements PackageService {

	@Autowired
	PackageDao packageDao;
	
	@Autowired
	CategoryDao categoryDao;
	
	public PackageServiceimpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean createPackage(Package Package) {
		return packageDao.createPackage(Package);
	}

	@Override
	public boolean deletePackage(int id) {
		return packageDao.deletePackage(id);
	}

	@Override
	public List<Package> getAllPackage() {
		return packageDao.getAllPackage();
	}

	@Override
	public boolean updatePackage(int id, Package Package) {
		return packageDao.updatePackage(id, Package);
	}

	@Override
	public Package getPackageById(int id) {
		return packageDao.getPackageById(id);
	}

	@Override
	public boolean createCategory(Category category) {
		return categoryDao.createCategory(category);
	}

	@Override
	public boolean deleteCategory(int id) {
		return categoryDao.deleteCategory(id);
	}

	@Override
	public List<Category> getAllCategory() {
		return categoryDao.getAllCategory();
	}

	@Override
	public boolean updateCategory(int id, Category category) {
		return categoryDao.updateCategory(id, category);
	}

	@Override
	public Category getCategoryById(int id) {
		return categoryDao.getCategoryById(id);
	}

}

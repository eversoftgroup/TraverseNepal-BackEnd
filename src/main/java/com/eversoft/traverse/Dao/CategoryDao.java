package com.eversoft.traverse.Dao;

import java.util.List;

import com.eversoft.traverse.Model.Category;

public interface CategoryDao {
	public boolean createCategory(Category category);
	public boolean deleteCategory(int id);
	public List<Category> getAllCategory();
	public boolean updateCategory(int id, Category category);
	public Category getCategoryById(int id);
}

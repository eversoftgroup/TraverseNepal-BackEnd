package com.eversoft.traverse.newDao;

import java.util.List;

import com.eversoft.traverse.newModel.GeneralGuide;

public interface GeneralGuideDao {
	public boolean createGuide(GeneralGuide Guide);
	public boolean deleteGuide(int id);
	public List<GeneralGuide> getAllGuide();
	public boolean updateGuide(int id, GeneralGuide Guide);
	public GeneralGuide getGuideById(int id);
}

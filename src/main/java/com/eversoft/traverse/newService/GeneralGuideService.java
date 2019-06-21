package com.eversoft.traverse.newService;

import java.util.List;

import com.eversoft.traverse.newModel.GeneralGuide;
import com.eversoft.traverse.newModel.Media;

public interface GeneralGuideService {
	public boolean createGuide(GeneralGuide Guide);
	public boolean deleteGuide(int id);
	public List<GeneralGuide> getAllGuide();
	public boolean updateGuide(int id, GeneralGuide Guide);
	public GeneralGuide getGuideById(int id);
	
	public boolean createMedia(Media Media);
	public boolean deleteMedia(int id);
//	public List<Media> getAllMedia();
	public boolean updateMedia(int id, Media Media);
	public Media getMediaById(int id);
}

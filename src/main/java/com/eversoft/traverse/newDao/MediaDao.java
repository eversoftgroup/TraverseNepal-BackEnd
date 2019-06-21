package com.eversoft.traverse.newDao;

import java.util.List;

import com.eversoft.traverse.newModel.Media;

public interface MediaDao {
	public boolean createMedia(Media Media);
	public boolean deleteMedia(int id);
//	public List<Media> getAllMedia();
	public boolean updateMedia(int id, Media Media);
	public Media getMediaById(int id);
}

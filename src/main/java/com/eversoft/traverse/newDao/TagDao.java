package com.eversoft.traverse.newDao;

import java.util.List;

import com.eversoft.traverse.newModel.Tag;

public interface TagDao {
	public boolean createTag(Tag Tag);
	public boolean deleteTag(int id);
	public List<Tag> getAllTag();
	public boolean updateTag(int id, Tag Tag);
	public Tag getTagById(int id);
}
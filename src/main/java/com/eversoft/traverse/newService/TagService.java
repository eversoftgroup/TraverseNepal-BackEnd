package com.eversoft.traverse.newService;

import java.util.List;

import com.eversoft.traverse.newModel.Tag;

public interface TagService {
	public boolean createTag(Tag Tag);
	public boolean deleteTag(int id);
	public List<Tag> getAllTag();
	public boolean updateTag(int id, Tag Tag);
	public Tag getTagById(int id);
}

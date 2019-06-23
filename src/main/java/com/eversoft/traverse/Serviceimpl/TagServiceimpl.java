package com.eversoft.traverse.Serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eversoft.traverse.Dao.TagDao;
import com.eversoft.traverse.Model.Tag;
import com.eversoft.traverse.Service.TagService;

@Service
public class TagServiceimpl implements TagService {
	
	@Autowired
	TagDao tagDao;

	public TagServiceimpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean createTag(Tag Tag) {
		return tagDao.createTag(Tag);
	}

	@Override
	public boolean deleteTag(int id) {
		return tagDao.deleteTag(id);
	}

	@Override
	public List<Tag> getAllTag() {
		return tagDao.getAllTag();
	}

	@Override
	public boolean updateTag(int id, Tag Tag) {
		return tagDao.updateTag(id, Tag);
	}

	@Override
	public Tag getTagById(int id) {
		return tagDao.getTagById(id);
	}

}

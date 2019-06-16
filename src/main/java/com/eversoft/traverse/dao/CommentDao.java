package com.eversoft.traverse.dao;

import java.util.List;

import com.eversoft.traverse.model.Comment;

public interface CommentDao {
	public boolean createComment(Comment comment);
	public boolean deleteComment(int id);
	public List<Comment> getAllComment(int answerId);
	public boolean updateComment(int id, Comment comment);
	public Comment getCommentById(int id);
}

package com.eversoft.traverse.dao;

import java.util.List;

import com.eversoft.traverse.model.Answer;

public interface AnswerDao {
	public boolean createAnswer(Answer answer);
	public boolean deleteAnswer(int id);
	public List<Answer> getAllAnswer(int questionId);
	public boolean updateAnswer(int id, Answer answer);
	public Answer getAnswerById(int id);

}

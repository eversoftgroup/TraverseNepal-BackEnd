package com.eversoft.traverse.Dao;

import java.util.List;

import com.eversoft.traverse.Model.Answer;

public interface AnswerDao {
	public boolean createAnswer(Answer answer);
	public boolean deleteAnswer(int id);
	public List<Answer> getAllAnswer(int questionId);
	public boolean updateAnswer(int id, Answer answer);
	public Answer getAnswerById(int id);
}

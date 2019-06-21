package com.eversoft.traverse.newDao;

import java.util.List;

import com.eversoft.traverse.newModel.Answer;

public interface AnswerDao {
	public boolean createAnswer(Answer answer);
	public boolean deleteAnswer(int id);
	public List<Answer> getAllAnswer(int questionId);
	public boolean updateAnswer(int id, Answer answer);
	public Answer getAnswerById(int id);
}

package com.eversoft.traverse.dao;

import java.util.List;

import com.eversoft.traverse.model.Question;

public interface QuestionDao {
	public boolean createQuestion(Question question);
	public boolean deleteQuestion(int id);
	public List<Question> getAllQuestion();
	public boolean updateQuestion(int id, Question question);
	public Question getQuestionById(int id);
}

package com.eversoft.traverse.Dao;

import java.util.List;

import com.eversoft.traverse.Model.Question;

public interface QuestionDao {
	public boolean createQuestion(Question Question);
	public boolean deleteQuestion(int id);
	public List<Question> getAllQuestion();
	public boolean updateQuestion(int id, Question Question);
	public Question getQuestionById(int id);
}
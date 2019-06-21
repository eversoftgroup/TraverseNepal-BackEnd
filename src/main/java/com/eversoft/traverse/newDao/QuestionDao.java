package com.eversoft.traverse.newDao;

import java.util.List;

import com.eversoft.traverse.newModel.Question;

public interface QuestionDao {
	public boolean createQuestion(Question Question);
	public boolean deleteQuestion(int id);
	public List<Question> getAllQuestion();
	public boolean updateQuestion(int id, Question Question);
	public Question getQuestionById(int id);
}
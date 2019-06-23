package com.eversoft.traverse.Service;

import java.util.List;

import com.eversoft.traverse.Model.Answer;
import com.eversoft.traverse.Model.Question;


public interface FaqService {
	public boolean createQuestion(Question Question);
	public boolean deleteQuestion(int id);
	public List<Question> getAllQuestion();
	public boolean updateQuestion(int id, Question Question);
	public Question getQuestionById(int id);
	
	public boolean createAnswer(Answer answer);
	public boolean deleteAnswer(int id);
	public List<Answer> getAllAnswer(int questionId);
	public boolean updateAnswer(int id, Answer answer);
	public Answer getAnswerById(int id);
}

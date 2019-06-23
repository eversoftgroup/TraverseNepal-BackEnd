package com.eversoft.traverse.Serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eversoft.traverse.Dao.AnswerDao;
import com.eversoft.traverse.Dao.QuestionDao;
import com.eversoft.traverse.Model.Answer;
import com.eversoft.traverse.Model.Question;
import com.eversoft.traverse.Service.FaqService;

@Service
public class FaqServiceImpl implements FaqService {
	
	@Autowired
	QuestionDao questionDao;
	
	@Autowired
	AnswerDao answerDao;

	public FaqServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean createQuestion(Question question) {
		return questionDao.createQuestion(question);
	}

	@Override
	public boolean deleteQuestion(int id) {
		return questionDao.deleteQuestion(id);
	}

	@Override
	public List<Question> getAllQuestion() {
		return questionDao.getAllQuestion();
	}

	@Override
	public boolean updateQuestion(int id, Question Question) {
		return questionDao.updateQuestion(id, Question);
	}

	@Override
	public Question getQuestionById(int id) {
		return questionDao.getQuestionById(id);
	}

	@Override
	public boolean createAnswer(Answer answer) {
		return answerDao.createAnswer(answer);
	}

	@Override
	public boolean deleteAnswer(int id) {
		return answerDao.deleteAnswer(id);
	}

	@Override
	public List<Answer> getAllAnswer(int questionId) {
		return answerDao.getAllAnswer(questionId);
	}

	@Override
	public boolean updateAnswer(int id, Answer answer) {
		return answerDao.updateAnswer(id, answer);
	}

	@Override
	public Answer getAnswerById(int id) {
		return answerDao.getAnswerById(id);
	}

}

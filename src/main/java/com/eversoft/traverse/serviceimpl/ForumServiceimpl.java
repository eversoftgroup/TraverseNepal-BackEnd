package com.eversoft.traverse.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eversoft.traverse.dao.QuestionDao;
import com.eversoft.traverse.dao.AnswerDao;
import com.eversoft.traverse.model.Answer;
//import com.eversoft.traverse.dao.commentDao;
import com.eversoft.traverse.model.Question;
import com.eversoft.traverse.service.ForumService;

@Service
public class ForumServiceimpl implements ForumService{
	
	@Autowired
	QuestionDao questionDao;
	
	@Autowired
	AnswerDao answerDao;
	
//	@Autowired
//	CommentDao commentDao;

	public ForumServiceimpl() {
		
	}
	
	/* For Questions */
	
	@Override
	public boolean createQuestion(Question question) {
		return questionDao.createQuestion(question);
	}
	
	@Override
	public List<Question> getAllQuestion(){
		return questionDao.getAllQuestion();
	}
	
	@Override
	public Question getQuestionById(int id) {
		return questionDao.getQuestionById(id);
	}
	
	@Override
	public boolean deleteQuestion(int id) {
		return questionDao.deleteQuestion(id);
	}
	
	@Override
	public boolean updateQuestion(int id, Question question) {
		return questionDao.updateQuestion(id, question);
	
	}
	
	/* For answers */
	
	@Override
	public boolean createAnswer(Answer answer) {
		return answerDao.createAnswer(answer);
	}
	
	@Override
	public boolean deleteAnswer(int id) {
		return answerDao.deleteAnswer(id);
	}
	
	@Override
	public List<Answer> getAllAnswer(int userId){
		return answerDao.getAllAnswer(userId);
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

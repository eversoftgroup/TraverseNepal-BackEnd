package com.eversoft.traverse.service;

import java.util.List;
import com.eversoft.traverse.model.Question;
import com.eversoft.traverse.model.Answer;
import com.eversoft.traverse.model.Comment;;

public interface ForumService {
	
	public boolean createQuestion(Question question);
	public boolean deleteQuestion(int id);
	public List<Question> getAllQuestion();
	public boolean updateQuestion(int id, Question question);
	public Question getQuestionById(int id);
	
	
	public boolean createAnswer(Answer answer);
	public boolean deleteAnswer(int id);
	public List<Answer> getAllAnswer(int questionId);
	public boolean updateAnswer(int id, Answer answer);
	public Answer getAnswerById(int id);
	
//	public boolean createComment(Comment comment);
//	public boolean deleteComment(int id);
//	public List<Comment> getAllComment(int answerId);
//	public boolean updateComment(int id, Comment comment);
//	public Question getCommentById(int id);
}

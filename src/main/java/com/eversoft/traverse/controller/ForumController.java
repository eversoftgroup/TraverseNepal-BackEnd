package com.eversoft.traverse.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eversoft.traverse.model.Question;
import com.eversoft.traverse.model.Answer;
import com.eversoft.traverse.model.Comment;
import com.eversoft.traverse.service.ForumService;

@RestController
@RequestMapping("/forum")
public class ForumController {

	@Autowired
	ForumService forumService;
	
	/* For Question section */
	@RequestMapping(value="/question/getall", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Question> getAllMethod() {
		List<Question> list = forumService.getAllQuestion();
		System.out.println("Question List: " + list);
		return list;
	}
	
	@RequestMapping(value="/question/update", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean updateMethod(@RequestBody Question question, @RequestParam(value="id") int id) {
		boolean updated =  forumService.updateQuestion(id, question);
		System.out.println("Question updated? : " + updated);
		return updated;
	}
	
	@RequestMapping(value="/question/delete", method = RequestMethod.GET)
	public boolean deleteMethod(@RequestParam(value="id") int id) {
		boolean deleted = forumService.deleteQuestion(id);
		System.out.println("DELETED Question with id = " + id + "?: " + deleted);
		return deleted;
	}
	
	@RequestMapping(value="/question/add", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean addMethod(@RequestBody Question question) {
		boolean added =  forumService.createQuestion(question);
		System.out.println("NEW Question ADDED? : " + added);
		return added;
	}
	
	@RequestMapping(value="/question/get", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Question getMethod(@RequestParam(value="id") int id) {
		Question question = forumService.getQuestionById(id);
		List<Answer> listAnswer = forumService.getAllAnswer(question.getId());
		question.setAnswer(listAnswer);
		System.out.println("GET Question: " + question);
		return question;
	}
	
	/* For answer section */
	@RequestMapping(value="/answer/getall", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Answer> getAllAnswersOfQuestion(@RequestParam(value="id") int id) {
		List<Answer> listAnswer = forumService.getAllAnswer(id);
		return listAnswer;
	}
	
	@RequestMapping(value="/answer/add", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public boolean addAnswers(@RequestBody Answer answer) {
		boolean added =  forumService.createAnswer(answer);
		System.out.println("New Answer ADDED? : " + added);
		return added;
	}
	
	@RequestMapping(value="/answer/update", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean updateAnswer(@RequestBody Answer answer, @RequestParam(value="id") int id) {
		boolean updated =  forumService.updateAnswer(id, answer);
		System.out.println("Answer updated? : " + updated);
		return updated;
	}
	
	@RequestMapping(value="/answer/delete", method = RequestMethod.GET)
	public boolean deleteAnswer(@RequestParam(value="id") int id) {
		boolean deleted = forumService.deleteAnswer(id);
		System.out.println("DELETED Answer with id = " + id + "?: " + deleted);
		return deleted;
	}
	
	 /* For Comment Section */
	@RequestMapping(value="/comment/getall", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Comment> getAllCommentsOfAnswer(@RequestParam(value="id") int id) {
		List<Comment> listAnswer = forumService.getAllComment(id);
		return listAnswer;
	}
	
	@RequestMapping(value="/comment/add", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public boolean addComment(@RequestBody Comment comment) {
		boolean added =  forumService.createComment(comment);
		System.out.println("New Comment ADDED? : " + added);
		return added;
	}
	
	@RequestMapping(value="/comment/update", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean updateComment(@RequestBody Comment comment, @RequestParam(value="id") int id) {
		boolean updated =  forumService.updateComment(id, comment);
		System.out.println("comment updated? : " + updated);
		return updated;
	}
	
	@RequestMapping(value="/comment/delete", method = RequestMethod.GET)
	public boolean deleteComment(@RequestParam(value="id") int id) {
		boolean deleted = forumService.deleteComment(id);
		System.out.println("DELETED comment with id = " + id + "?: " + deleted);
		return deleted;
	}
	
} 

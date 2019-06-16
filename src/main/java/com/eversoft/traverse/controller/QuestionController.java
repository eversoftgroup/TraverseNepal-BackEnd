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
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	ForumService forumService;
	
	@RequestMapping(value="/getall", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Question> getAllMethod() {
		List<Question> list = forumService.getAllQuestion();
		System.out.println("Question List: " + list);
		return list;
	}
	
	@RequestMapping(value="/update", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean updateMethod(@RequestBody Question question, @RequestParam(value="id") int id) {
		boolean updated =  forumService.updateQuestion(id, question);
		System.out.println("Question updated? : " + updated);
		return updated;
	}
	
	@RequestMapping(value="/delete", method = RequestMethod.GET)
	public boolean deleteMethod(@RequestParam(value="id") int id) {
		boolean deleted = forumService.deleteQuestion(id);
		System.out.println("DELETED Question with id = " + id + "?: " + deleted);
		return deleted;
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean addMethod(@RequestBody Question question) {
		boolean added =  forumService.createQuestion(question);
		System.out.println("NEW Question ADDED? : " + added);
		return added;
	}
	
	@RequestMapping(value="/get", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Question getMethod(@RequestParam(value="id") int id) {
		Question question = forumService.getQuestionById(id);
		List<Answer> listAnswer = forumService.getAllAnswer(question.getId());
		question.setAnswer(listAnswer);
		System.out.println("GET Question: " + question);
		return question;
	}
	
	
} 

package com.eversoft.traverse.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eversoft.traverse.dao.QuestionDao;
import com.eversoft.traverse.model.Question;
import com.eversoft.traverse.utility.HibernateUtil;

@Repository
public class QuestionDaoimpl implements QuestionDao{
	
	@Override
	public boolean createQuestion(Question question) {
		try {
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  session.save(question);
			  System.out.println("Create Question called");
			  transaction.commit();
			  session.close();
			  return true;
      } catch(Exception sqlException) {
          sqlException.printStackTrace();
      } 
		return false;
	}
	
	@Override
	public boolean deleteQuestion(int id) {
		try {
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  boolean ret = false;
			  Question question = (Question)session.get(Question.class, id);
			  
			  if(question != null) {
				  session.delete(question);
				  System.out.println("Delete Question Called");
				  session.flush();
				  transaction.commit();
				  ret =  true;
			  }
			  session.close();
			  return ret;
			
		}catch(Exception sqlException) {
          sqlException.printStackTrace();
          return false;
      }
	}
	
	@Override
	public List<Question> getAllQuestion(){
		try
	    {
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  List<Question> list = session.createCriteria(Question.class).list();
			  System.out.println("Get ALl Question Called");
	         return list;
	    } catch (Exception e) {
	        return new ArrayList<Question>();
	    }
	}
	
	@Override
	public boolean updateQuestion(int id, Question question) {
		try {
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  question.setId(id);
			  session.update(question);
			  System.out.println("Update Question called");
			  transaction.commit();
			  session.close();
			  return true;
    } catch(Exception sqlException) {
        sqlException.printStackTrace();
    } 
		return false;
	}
	
	@Override
	public Question getQuestionById(int id){
		try {
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  Question question = (Question)session.get(Question.class, id);
			  System.out.println("GetQuestion ByID called");
			  transaction.commit();
			  session.close();
			  return question;
		}catch(Exception sqlException) {
          sqlException.printStackTrace();
          return null;
      }
	}

}

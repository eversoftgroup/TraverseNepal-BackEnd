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

import com.eversoft.traverse.dao.AnswerDao;
import com.eversoft.traverse.model.Answer;
import com.eversoft.traverse.utility.HibernateUtil;

@Repository
public class AnswerDaoimpl implements AnswerDao{
	
	@Override
	public boolean createAnswer(Answer answer) {
		try {
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  session.save(answer);
			  System.out.println("Create answer called");
			  transaction.commit();
			  session.close();
			  return true;
    } catch(Exception sqlException) {
        sqlException.printStackTrace();
    } 
		return false;
	}
	
	@Override
	public boolean deleteAnswer(int id) {
		try {
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  boolean ret = false;
			  Answer answer = (Answer)session.get(Answer.class, id);
			  
			  if(answer != null) {
				  session.delete(answer);
				  System.out.println("Delete Answer Called");
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
	public List<Answer> getAllAnswer(int userId){
		try
	    {
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  List<Answer> list = session.createCriteria(Answer.class).list();
			  System.out.println("Get ALl answer Called");
	         return list;
	    } catch (Exception e) {
	        return new ArrayList<Answer>();
	    }
	}
	
	@Override
	public boolean updateAnswer(int id, Answer answer) {
		try {
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  answer.setId(id);
			  session.update(answer);
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
	public Answer getAnswerById(int id) {
		try {
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  Answer answer = (Answer)session.get(Answer.class, id);
			  System.out.println("GetQuestion ByID called");
			  transaction.commit();
			  session.close();
			  return answer;
		}catch(Exception sqlException) {
        sqlException.printStackTrace();
        return null;
		}
	}
}

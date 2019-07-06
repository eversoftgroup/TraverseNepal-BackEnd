package com.eversoft.traverse.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eversoft.traverse.dao.CommentDao;
import com.eversoft.traverse.model.Comment;
import com.eversoft.traverse.utility.HibernateUtil;

@Repository
public class CommentDaoimpl implements CommentDao{
	
	@Override
	public boolean createComment(Comment comment) {
		try {
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  session.save(comment);
			  System.out.println("Create comment called");
			  transaction.commit();
			  session.close();
			  return true;
	  } catch(Exception sqlException) {
	      sqlException.printStackTrace();
	  } 
		return false;
	}
	
	@Override
	public boolean deleteComment(int id) {
		try {
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  boolean ret = false;
			  Comment comment = (Comment)session.get(Comment.class, id);
			  
			  if(comment != null) {
				  session.delete(comment);
				  System.out.println("Delete Comment Called");
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
	public List<Comment> getAllComment(int answerId){
		try
	    {
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  
			  String hql = "FROM Comment comment WHERE comment.answerId = " + answerId;
			  Query query = session.createQuery(hql);
			  List<Comment> list = query.list();
			  System.out.println("Get ALl Comment Called");
	         return list;
	    } catch (Exception e) {
	        return new ArrayList<Comment>();
	    }
	}
	
	@Override
	public boolean updateComment(int id, Comment comment) {
		try {
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  comment.setId(id);
			  session.update(comment);
			  System.out.println("Update Comment called");
			  transaction.commit();
			  session.close();
			  return true;
		  } catch(Exception sqlException) {
		      sqlException.printStackTrace();
		  } 
				return false;
	}
	
	@Override
	public Comment getCommentById(int id) {
		try {
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  Comment comment = (Comment)session.get(Comment.class, id);
			  System.out.println("GetCommentById called");
			  transaction.commit();
			  session.close();
			  return comment;
		}catch(Exception sqlException) {
	      sqlException.printStackTrace();
	      return null;
		}
	}
}

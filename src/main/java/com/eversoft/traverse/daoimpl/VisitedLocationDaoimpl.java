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

import com.eversoft.traverse.dao.VisitedLocationDao;
import com.eversoft.traverse.utility.HibernateUtil;
import com.eversoft.traverse.model.VisitedLocation;

@Repository
public class VisitedLocationDaoimpl implements VisitedLocationDao{

	@Override
	public boolean createVisitedLocation(VisitedLocation visitedLocation) {
		try {
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  session.save(visitedLocation);
			  System.out.println("Create Visited Location called");
			  transaction.commit();
			  session.close();
			  return true;
		} catch(Exception sqlException) {
		    sqlException.printStackTrace();
		} 
		return false;
	}
	
	@Override
	public boolean deleteVisitedLocation(int id) {
		try {
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  boolean ret = false;
			  VisitedLocation location = (VisitedLocation)session.get(VisitedLocation.class, id);
			  
			  if(location != null) {
				  session.delete(location);
				  System.out.println("Delete Visited Location Called");
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
	public List<VisitedLocation> getAllVisitedLocation(int userId){
		try
	    {
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  
//			  String hql = "FROM Answer answer WHERE answer.questionId = " + questionId;
			  String hql = "";
			  Query query = session.createQuery(hql);
			  List<VisitedLocation> list = query.list();
			  System.out.println("Get All Visited Location Called");
	         return list;
	    } catch (Exception e) {
	        return new ArrayList<VisitedLocation>();
	    }
	}
	
	@Override
	public boolean updateVisitedLocation(int id, VisitedLocation visitedLocation) {
		try {
			  //getting session object from session factory
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  visitedLocation.setId(id);
			  session.update(visitedLocation);
			  System.out.println("Update Location called");
			  transaction.commit();
			  session.close();
			  return true;
  } catch(Exception sqlException) {
      sqlException.printStackTrace();
  } 
		return false;
	}
	
	@Override
	public VisitedLocation getVisitedLocationById(int id) {
		try {
			  //getting session object from session factory
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  VisitedLocation location = (VisitedLocation)session.get(VisitedLocation.class, id);
			  System.out.println("VisitedLocation By Id called");
			  transaction.commit();
			  session.close();
			  
			  return location;
		}catch(Exception sqlException) {
        sqlException.printStackTrace();
        return null;
		}
	}
}

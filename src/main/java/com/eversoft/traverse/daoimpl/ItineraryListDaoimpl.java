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

import com.eversoft.traverse.dao.ItineraryListDao;
import com.eversoft.traverse.model.Answer;
import com.eversoft.traverse.model.Itinerary;
import com.eversoft.traverse.model.User;
import com.eversoft.traverse.utility.HibernateUtil;

@Repository
public class ItineraryListDaoimpl implements ItineraryListDao{
	
	@Override
	public boolean createItinerary(Itinerary itinerary) {
		try {
			  //getting session object from session factory
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  session.save(itinerary);
			  System.out.println("Create itinerary called");
			  transaction.commit();
			  session.close();
			  return true;
        } catch(Exception sqlException) {
            sqlException.printStackTrace();
        } 
		return false;
	}
	
	@Override
	public boolean deleteItinerary(int id) {
		try {
			  //getting session object from session factory
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  boolean ret = false;
			  Itinerary itinerary = (Itinerary)session.get(Itinerary.class, id);
			  
			  
			  if(itinerary != null) {
				  session.delete(itinerary);
				  System.out.println("Delete Itinerary Called");
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
	public List<Itinerary> getAllItinerary(int id) {
		try
	    {
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  
			  String hql = "FROM Itinerary itinerary WHERE itinerary.userId = " + id;
			  Query query = session.createQuery(hql);
			  List<Itinerary> list = query.list();
			  
			  System.out.println("Get ALl Itinerary Called");
	         return list;
	    } catch (Exception e) {
	        return new ArrayList<Itinerary>();
	    }
	}
	
	@Override
	public boolean updateItinerary(int id, Itinerary itinerary) {
		try {
			  //getting session object from session factory
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  itinerary.setId(id);
			  session.update(itinerary);
			  System.out.println("Update Itinerary called");
			  transaction.commit();
			  session.close();
			  return true;
      } catch(Exception sqlException) {
          sqlException.printStackTrace();
      } 
		return false;
	}

	@Override
	public Itinerary getItineraryById(int id) {

		try {
			  //getting session object from session factory
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  Itinerary itinerary = (Itinerary)session.get(Itinerary.class, id);
			  System.out.println("Get Itinerary By ID called");
			  transaction.commit();
			  session.close();
			  
			  return itinerary;
		}catch(Exception sqlException) {
            sqlException.printStackTrace();
            return null;
        }
	}
}

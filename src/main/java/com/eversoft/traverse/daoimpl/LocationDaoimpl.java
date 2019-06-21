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

import com.eversoft.traverse.dao.LocationDao;
import com.eversoft.traverse.utility.HibernateUtil;
import com.eversoft.traverse.model.Location;

@Repository
public class LocationDaoimpl implements LocationDao{

	@Override
	public boolean createLocation(Location location) {
		try {
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  session.save(location);
			  System.out.println("Create Location called");
			  transaction.commit();
			  session.close();
			  return true;
		  } catch(Exception sqlException) {
		      sqlException.printStackTrace();
		  } 
			return false;
}

	public boolean deleteLocation(int id) {
		try {
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  boolean ret = false;
			  Location location = (Location)session.get(Location.class, id);
			  
			  if(location != null) {
				  session.delete(location);
				  System.out.println("Delete Location Called");
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
	public List<Location> getAllLocation(){
		try
	    {
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  List<Location> list = session.createCriteria(Location.class).list();
			  System.out.println("Get ALl Location Called");
	         return list;
	    } catch (Exception e) {
	        return new ArrayList<Location>();
	    }
	}
	
	@Override
	public boolean updateLocation(int id, Location location) {
		try {
			  //getting session object from session factory
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  location.setId(id);
			  session.update(location);
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
	public Location getLocationById(int id) {
		try {
			  //getting session object from session factory
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  Location location = (Location)session.get(Location.class, id);
			  System.out.println("GetLocationByID called");
			  transaction.commit();
			  session.close();
			  
			  return location;
		}catch(Exception sqlException) {
          sqlException.printStackTrace();
          return null;
      }
	}
}

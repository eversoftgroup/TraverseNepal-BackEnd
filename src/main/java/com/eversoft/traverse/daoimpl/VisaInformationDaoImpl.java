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

import com.eversoft.traverse.dao.UserDao;
import com.eversoft.traverse.dao.VisaInformationDao;
import com.eversoft.traverse.model.User;
import com.eversoft.traverse.model.VisaInformation;
import com.eversoft.traverse.utility.HibernateUtil;

@Repository
public class VisaInformationDaoImpl implements VisaInformationDao {

	
	@Override
	public boolean createVisaInformation(VisaInformation visaInformation) {
		
		try {
			  //getting session object from session factory
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  session.save(visaInformation);
			  System.out.println("Create visa information called");
			  transaction.commit();
			  session.close();
			  return true;
        } catch(Exception sqlException) {
            sqlException.printStackTrace();
        } 
		return false;
	}

	@Override
	public VisaInformation getVisaInformationById(int id) {
		
		try {
			  //getting session object from session factory
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  VisaInformation visaInformation = (VisaInformation)session.get(VisaInformation.class, id);
			  System.out.println("GetVisaInformationById called");
			  transaction.commit();
			  session.close();
			  
			  return visaInformation;
		}catch(Exception sqlException) {
            sqlException.printStackTrace();
            return null;
        }
		
	}

	@Override
	public boolean deleteVisaInformation(int id) {
		try {
			  //getting session object from session factory
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  boolean ret = false;
			  VisaInformation visaInformation = (VisaInformation)session.get(VisaInformation.class, id);
			  
			  
			  if(visaInformation != null) {
				  session.delete(visaInformation);
				  System.out.println("Delete User Called");
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
	public List<VisaInformation> getAllVisaInformations() {
		try
	    {
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  List<VisaInformation> list = session.createCriteria(VisaInformation.class).list();
			  System.out.println("Get ALl Visa Informations Called");
	         return list;
	    } catch (Exception e) {
	        return new ArrayList<VisaInformation>();
	    }
	}

	@Override
	public boolean updateVisaInformation(int id, VisaInformation visaInformation) {
		try {
			  //getting session object from session factory
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  visaInformation.setId(id);
			  session.update(visaInformation);
			  System.out.println("Update VisaInformation called");
			  transaction.commit();
			  session.close();
			  return true;
      } catch(Exception sqlException) {
          sqlException.printStackTrace();
      } 
		return false;
	}

}

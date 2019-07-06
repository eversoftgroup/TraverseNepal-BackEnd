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
import com.eversoft.traverse.model.User;
import com.eversoft.traverse.utility.HibernateUtil;

@Repository
public class UserDaoImpl implements UserDao {

	
	@Override
	public boolean createUser(User user) {
		
		try {
			  //getting session object from session factory
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  session.save(user);
			  System.out.println("Create user called");
			  transaction.commit();
			  session.close();
			  return true;
        } catch(Exception sqlException) {
            sqlException.printStackTrace();
        } 
		return false;
	}

	@Override
	public User getUserById(int id) {
		
		try {
			  //getting session object from session factory
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  User user = (User)session.get(User.class, id);
			  System.out.println("GetUserByID called");
			  transaction.commit();
			  session.close();
			  
			  return user;
		}catch(Exception sqlException) {
            sqlException.printStackTrace();
            return null;
        }
		
	}

	@Override
	public boolean deleteUser(int id) {
		try {
			  //getting session object from session factory
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  boolean ret = false;
			  User user = (User)session.get(User.class, id);
			  
			  
			  if(user != null) {
				  session.delete(user);
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
	public List<User> getAllUsers() {
		try
	    {
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  List<User> list = session.createCriteria(User.class).list();
			  System.out.println("Get ALl Users Called");
	         return list;
	    } catch (Exception e) {
	        return new ArrayList<User>();
	    }
	}

	@Override
	public boolean updateUser(int id, User user) {
		try {
			  //getting session object from session factory
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  user.setId(id);
			  session.update(user);
			  System.out.println("Update User called");
			  transaction.commit();
			  session.close();
			  return true;
      } catch(Exception sqlException) {
          sqlException.printStackTrace();
      } 
		return false;
	}

}

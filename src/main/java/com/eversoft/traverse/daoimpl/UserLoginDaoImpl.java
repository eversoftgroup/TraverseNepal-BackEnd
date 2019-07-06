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

import com.eversoft.traverse.dao.UserDao;
import com.eversoft.traverse.dao.UserLoginDao;
import com.eversoft.traverse.model.Answer;
import com.eversoft.traverse.model.User;
import com.eversoft.traverse.model.UserLogin;
import com.eversoft.traverse.utility.HibernateUtil;

@Repository
public class UserLoginDaoImpl implements UserLoginDao {

	
	@Override
	public boolean createUserLogin(UserLogin userLogin) {
		
		try {
			  //getting session object from session factory
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  session.save(userLogin);
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
	public UserLogin getUserLoginById(int id) {
		
		try {
			  //getting session object from session factory
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  UserLogin userLogin = (UserLogin)session.get(UserLogin.class, id);
			  System.out.println("Get User Login by ID called");
			  transaction.commit();
			  session.close();
			  
			  return userLogin;
		}catch(Exception sqlException) {
            sqlException.printStackTrace();
            return null;
        }
		
	}

	@Override
	public boolean deleteUserLogin(int id) {
		try {
			  //getting session object from session factory
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  boolean ret = false;
			  UserLogin userLogin = (UserLogin)session.get(UserLogin.class, id);
			  
			  
			  if(userLogin != null) {
				  session.delete(userLogin);
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
	public boolean updateUserLogin(int id, UserLogin userLogin) {
		try {
			  //getting session object from session factory
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  userLogin.setId(id);
			  session.update(userLogin);
			  System.out.println("Update User called");
			  transaction.commit();
			  session.close();
			  return true;
      } catch(Exception sqlException) {
          sqlException.printStackTrace();
      } 
		return false;
	}

	@Override
	public UserLogin getUserLoginByUsername(String username) {
		try {
			  //getting session object from session factory
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  
			  String hql = "FROM UserLogin userlogin WHERE userlogin.username = \'" + username + "\'";
			  Query query = session.createQuery(hql);
			  UserLogin userLogin = (UserLogin)query.getSingleResult();
			  System.out.println("Get User Login by username called");
			  transaction.commit();
			  session.close();
			  
			  return userLogin;
		}catch(Exception sqlException) {
          sqlException.printStackTrace();
          return null;
      }
	}

	@Override
	public UserLogin getUserLoginByEmail(String email) {
		try {
			  //getting session object from session factory
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  
			  String hql = "FROM UserLogin userlogin WHERE userlogin.email = \'" + email + "\'";
			  Query query = session.createQuery(hql);
			  UserLogin userLogin = (UserLogin)query.getSingleResult();
			  System.out.println("Get User Login by username called");
			  transaction.commit();
			  session.close();
			  
			  return userLogin;
		}catch(Exception sqlException) {
	        sqlException.printStackTrace();
	        return null;
	    }
	}

	@Override
	public boolean isValidAPIKey(String key) {
		try {
			  //getting session object from session factory
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  Transaction transaction = session.getTransaction();
			  transaction.begin();
			  
			  String hql = "FROM UserLogin userlogin WHERE userlogin.apiKey = \'" + key + "\'";
			  Query query = session.createQuery(hql);
			  UserLogin userLogin = (UserLogin)query.getSingleResult();
			  System.out.println("isValidAPIKey called");
			  transaction.commit();
			  session.close();
			  
			  if(userLogin == null) {
				  return false;
			  }else {
				  return true;
			  }
		}catch(Exception sqlException) {
		      sqlException.printStackTrace();
		      return false;
		}
	}

}

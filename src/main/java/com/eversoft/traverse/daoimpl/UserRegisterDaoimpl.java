package com.eversoft.traverse.daoimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.eversoft.traverse.dao.UserRegisterDao;
import com.eversoft.traverse.model.User;
import com.eversoft.traverse.utility.HibernateUtil;

@Repository
public class UserRegisterDaoimpl implements UserRegisterDao {

	@Override
	public boolean createUserRegister(User user) {
		try {
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
	public User getUserRegisterById(int id) {
		return null;
	}

	@Override
	public boolean deleteUserRegister(int id) {
		return false;
	}

	@Override
	public boolean updateUserRegister(int id, User user) {
		return false;
	}

}

package com.jsp.signup.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.signup.model.User;


@Repository
public class UserRepository {
	
	@Autowired
	private User user;
	
	public static Session getSession() {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory();
		return sessionFactory.openSession();
	}
	
	public void saveUser(int userId, String userName, String userPasword, String userEmail) {
		
		Session session = UserRepository.getSession();
		Transaction transaction = session.beginTransaction();
		
		user.setUserId(userId);
		user.setUserName(userName);
		user.setUserPassword(userPasword);
		user.setUserEmail(userEmail);
		
		session.save(user);
		transaction.commit();
		session.close();
	}

}

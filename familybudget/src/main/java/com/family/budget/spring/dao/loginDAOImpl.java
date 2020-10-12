package com.family.budget.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.family.budget.spring.model.login;
import com.family.budget.spring.model.user;

@Repository
public class loginDAOImpl implements loginDAO {
	
	@Autowired
	private SessionFactory SessionFactory;

	@Override
	public List<user> userauthent (login login) {
		System.out.println("Login DAO"+login.getLogin_user_name());
		System.out.println("Login DAO"+login.getPassword_ID());
		// TODO Auto-generated method stub
		Session session=SessionFactory.getCurrentSession();
		Query query=session.createQuery("from user_table where LOGIN_USER_NAME=:username and PASSWORD_ID=:password");
		query.setParameter("username", login.getLogin_user_name());
		query.setParameter("password", login.getPassword_ID());
		List<user> users = query.list();
		
		System.out.println("user DAO"+ users.size());
		//System.out.println("user DAO"+login.getPassword_ID());
		//user user=(com.family.budget.spring.model.user) .createQuery("from user_table where LOGIN_USER_NAME=:username and PASSWORD_ID=:password");
		//return SessionFactory.getCurrentSession().createQuery("from user_table").list();
		return users.size()>0 ? users:null;
	}

}

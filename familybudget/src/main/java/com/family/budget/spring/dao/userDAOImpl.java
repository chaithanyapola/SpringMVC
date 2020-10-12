package com.family.budget.spring.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.family.budget.spring.model.user;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

@Repository
public class userDAOImpl implements userDAO{

	@Autowired
	private SessionFactory SessionFactory;
	
	@Override
	public long save(user users) {
		SessionFactory.getCurrentSession().save(users);
		return users.getLogin_id();
	}

	@Override
	public user get(int id) {
		user users=SessionFactory.getCurrentSession().get(user.class, id);
		return users;
	}

	@Override
	public List<user> list() {
	
		List<user> list=SessionFactory.getCurrentSession().createQuery("from user_table").list();
		return SessionFactory.getCurrentSession().createQuery("from user_table").list();
	}

	@Override
	public void update(int id, user users) {
	 
		Session session=SessionFactory.getCurrentSession();
		user olduser=session.byId(user.class).load(id);
		olduser.setLogin_user_name(users.getLogin_user_name());
		olduser.setEmail_Id(users.getEmail_Id());
		olduser.setPassword_ID(users.getPassword_ID());
		olduser.setFirst_name(users.getFirst_name());
		olduser.setLast_name(users.getLast_name());
		olduser.setUpadated_date(users.getUpadated_date());
	    session.flush();		
	}

	@Override
	public void delete(int id) {
		Session session=SessionFactory.getCurrentSession();
		user users=session.byId(user.class).load(id);
		session.remove(users);
		
	}

}

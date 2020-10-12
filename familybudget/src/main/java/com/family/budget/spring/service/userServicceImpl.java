package com.family.budget.spring.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.family.budget.spring.dao.userDAO;
import com.family.budget.spring.model.user;

@Service

public class userServicceImpl implements userService {
	
	@Autowired
	private userDAO userdao;

	@Override
	@Transactional
	public long save(user users) {
		return userdao.save(users);
	}

	@Override
	@Transactional
	public user get(int id) {
		// TODO Auto-generated method stub
			return userdao.get(id);
	}

	@Override
	@Transactional
	public List<user> list() {
	     
		return userdao.list();
	}

	@Override
	@Transactional
	public void update(int id,user users) {
	
		userdao.update(id, users);
	
		
	}

	@Override
	@Transactional
	public void delete(int id) {
		userdao.delete(id);
		
	}

}

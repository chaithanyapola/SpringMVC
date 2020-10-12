package com.family.budget.spring.dao;

import java.util.List;

import com.family.budget.spring.model.login;
import com.family.budget.spring.model.user;

public interface loginDAO {
	
	public List<user> userauthent(login login);

	

}

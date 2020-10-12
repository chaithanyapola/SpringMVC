package com.family.budget.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.family.budget.spring.dao.loginDAO;
import com.family.budget.spring.model.login;
import com.family.budget.spring.model.user;

@Service

public class loginServiceImpl implements loginService {
	
	@Autowired
	private loginDAO LoginDAO;

	@Override
	@Transactional
	public List<user> userauthent(login Login) {
		// TODO Auto-generated method stub
		System.out.println("Login Service"+Login.getLogin_user_name());
		System.out.println("Login Service"+Login.getPassword_ID());
		return LoginDAO.userauthent(Login);
	}

}

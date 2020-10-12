package com.family.budget.spring.service;

import java.util.List;

import com.family.budget.spring.model.login;
import com.family.budget.spring.model.user;

public interface loginService {

	public List<user> userauthent(login Login);
}

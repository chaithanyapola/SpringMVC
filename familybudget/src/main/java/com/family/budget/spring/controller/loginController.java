package com.family.budget.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import com.family.budget.spring.model.login;
import com.family.budget.spring.model.user;

import com.family.budget.spring.service.loginService;


@CrossOrigin("*")
@RestController
public class loginController {
	@Autowired
	private loginService LoginService;
	


@PostMapping("/api/loginAuth")

	
	public ResponseEntity<?> findUser(@RequestBody login Login) throws Exception
	{
		System.out.println("Login"+ Login.getLogin_user_name());
		System.out.println("Login"+ Login.getPassword_ID());
		
		List<user> list=LoginService.userauthent(Login);
	
		return  ResponseEntity.ok().body(list);
	}


}
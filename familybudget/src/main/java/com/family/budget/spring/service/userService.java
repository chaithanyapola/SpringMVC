package com.family.budget.spring.service;

import java.util.List;

import com.family.budget.spring.model.user;

public interface userService {
	// To save
		long save(user user);
		
		//Get a single record
		
		user get(int id);
		
		//Get list of records
		
		List<user> list();
		
		//To update
		
		void update(int id,user users);
		
		// To delete
		
		void delete(int id);

}

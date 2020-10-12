package com.family.budget.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.family.budget.spring.model.login;
import com.family.budget.spring.model.user;
import com.family.budget.spring.service.loginService;
import com.family.budget.spring.service.userService;

@CrossOrigin("*")
@RestController
public class userController {
	
	@Autowired
	private userService userservice;
	
	
	//Get all user
	
	@GetMapping("/api/users")
	public ResponseEntity<List<user>> list(){
		List<user> list = userservice.list();
		System.out.println("user "+list);
		return ResponseEntity.ok().body(list);
	}
	
	//Save the user
	
	@PostMapping("/api/user")
	
	public ResponseEntity<?> save(@RequestBody user users)
	{
		long login_id=userservice.save(users);
		return ResponseEntity.ok().body("user is created");
	}

	// Get Single user
	@GetMapping("/api/users/{id}")
	
	public ResponseEntity<user> get(@PathVariable("id") int id){
		
		user users= userservice.get(id);		
		return ResponseEntity.ok().body(users);
				
	}
	
	//updatw
	@PutMapping("/api/users/{id}")
	
	public ResponseEntity<?> update(@PathVariable("id") int id,@RequestBody user users){
		userservice.update(id, users);
		return ResponseEntity.ok().body("recod got updated");		
	}
	
	// Delete(
	
	@DeleteMapping("/api/users/{id}")
	
	public ResponseEntity<?> delete(@PathVariable("id") int id){
		userservice.delete(id);
		return ResponseEntity.ok().body("id got deleted "+id);
		
	}
	
	
}

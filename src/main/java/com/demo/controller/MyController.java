package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.User;
import com.demo.service.UserServiceImpl;

@RestController
public class MyController {
	
	@Autowired
	private UserServiceImpl us;
	
	@GetMapping("/user")
	public List<User> getUsers(){
		return this.us.getUser();
	}
	
	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		return this.us.addUser(user);
	}
	
	@PutMapping("/user/{userId}")
	public User updateUser(@RequestBody User user) {
		return this.us.updateUser(user);
	}
	
	@DeleteMapping("/user/{userId}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable String userId){
		try {
		this.us.deleteUser(Long.parseLong(userId));
		return new ResponseEntity<>(HttpStatus.OK);
	}catch(Exception e) {
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
		
	}

}

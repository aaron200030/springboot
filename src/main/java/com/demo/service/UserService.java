package com.demo.service;

import java.util.List;

import com.demo.entity.User;

public interface UserService {
	public List<User> getUser();
	
	public User addUser(User user);
	
	public User updateUser(User user);
	
	public void deleteUser(long parseLong);
	

}

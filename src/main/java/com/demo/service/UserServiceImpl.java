package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.UserDao;
import com.demo.entity.User;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao ud;

	@Override
	public List<User> getUser() {
		// TODO Auto-generated method stub
		return ud.findAll();
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		ud.save(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		ud.save(user);
		return user;	}

	@Override
	public void deleteUser(long parseLong) {
		// TODO Auto-generated method stub
		User en=ud.getOne(parseLong);
		ud.delete(en);
		
	}

}

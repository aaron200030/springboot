package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.User;

public interface UserDao extends JpaRepository<User,Long>{
	

}

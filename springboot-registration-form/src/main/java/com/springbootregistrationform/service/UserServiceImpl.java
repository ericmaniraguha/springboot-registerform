package com.springbootregistrationform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootregistrationform.entity.User;
import com.springbootregistrationform.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
     
	@Autowired
	private UserRepository repo;
	
	@Override
	public void registerUser(User user) {
		
		repo.save(user); // saving into the rdbms
		
		
	}

}

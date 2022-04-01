package com.malek.userservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malek.userservices.entity.User;
import com.malek.userservices.repositry.userRepository;

@Service
public class userService {
@Autowired
	private userRepository userrepository;

public User saveUser(User user) {
	return userrepository.save(user);
}

	
}

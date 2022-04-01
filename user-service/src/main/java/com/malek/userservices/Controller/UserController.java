package com.malek.userservices.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.malek.userservices.entity.User;
import com.malek.userservices.service.userService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
	
	@Autowired
	private userService userservice ;
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user)
	{
		return userservice.saveUser(user);
	}

}

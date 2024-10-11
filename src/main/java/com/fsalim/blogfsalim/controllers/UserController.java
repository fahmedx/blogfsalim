package com.fsalim.blogfsalim.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsalim.blogfsalim.entities.User;
import com.fsalim.blogfsalim.repositories.UserRepository;

@RestController
@RequestMapping(value="/users")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping
	public List<User> findAll(){
		List<User> result = userRepository.findAll();
		return result;
	}
}

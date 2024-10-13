package com.fsalim.blogfsalim.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsalim.blogfsalim.entities.User;
import com.fsalim.blogfsalim.repositories.UserRepository;
import com.fsalim.blogfsalim.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserController {
	
	private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
	
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    
	/*@Autowired
	private UserRepository userRepository;
	
	@GetMapping
	public List<User> findAll(){
		List<User> result = userRepository.findAll();
		return result;
	}*/
}

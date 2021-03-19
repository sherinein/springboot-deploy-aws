package com.spring.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.security.model.User;
import com.spring.security.repository.UserRepository;

@RestController
@RequestMapping("/secure/rest")
public class AdminController {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@PostMapping("/admin/add")
	public String addUserByAdmin(@RequestBody User user) {
		String pwd=user.getPassword();
		String encryptedPwd=passwordEncoder.encode(pwd);
		user.setPassword(encryptedPwd);
		userRepository.save(user);
		return "user added successfully";
		
	}

}

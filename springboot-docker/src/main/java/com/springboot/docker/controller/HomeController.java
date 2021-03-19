package com.springboot.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.docker.model.Customer;

@RestController
public class HomeController {
	@GetMapping("/")
	public Customer welcomeDocker() {
		Customer customer=new Customer();
		customer.setName("Nirmala");
		return customer;
	}
	
	

}

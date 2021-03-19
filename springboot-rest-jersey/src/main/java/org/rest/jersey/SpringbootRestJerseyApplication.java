package org.rest.jersey;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.rest.jersey.dao.EmployeeDao;
import org.rest.jersey.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootRestJerseyApplication {
	@Autowired
	private EmployeeDao employeeDao;
	
	@PostConstruct
	public void initDB() {
		employeeDao.saveAll(Stream.of(new Employee(1,"arun","Dev"),new Employee(2,"lynet","Dev"),new Employee(3,"priya","tester"),new Employee(4,"banu","hr")).collect(Collectors.toList()));
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestJerseyApplication.class, args);
	}

}

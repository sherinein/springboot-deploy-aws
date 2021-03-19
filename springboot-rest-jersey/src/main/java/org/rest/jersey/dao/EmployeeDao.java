package org.rest.jersey.dao;


import java.util.List;

import org.rest.jersey.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EmployeeDao extends JpaRepository<Employee,Integer>{

	public List<Employee> findByNameEquals(String name);

}

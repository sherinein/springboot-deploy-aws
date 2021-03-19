package org.dxc.rest.repository;

import org.dxc.rest.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee,Integer>{

}

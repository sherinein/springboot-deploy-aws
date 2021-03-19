package org.springcore.mockito.service;

import java.util.List;

import org.springcore.mockito.dao.EmployeeDao;
import org.springcore.mockito.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeeManager 
{
    @Autowired
    EmployeeDao dao;
     
    public List<Employee> getEmployeeList() {
        return dao.getEmployeeList();
    }
     
    public Employee getEmployeeById(int id) {
        return dao.getEmployeeById(id);
    }
     
    public void addEmployee(Employee employee) {
        dao.addEmployee(employee);
    }
}
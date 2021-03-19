package com.springboot.mockito.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.mockito.dao.EmployeeDao;
import com.springboot.mockito.model.Employee;

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
package org.hibernate.api.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.api.dao.EmployeeDao;
import org.hibernate.api.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
 
    @Autowired
    private EmployeeDao dao;
     
    public void saveEmployee(Employee employee) {
        dao.saveEmployee(employee);
    }
 
    public List<Employee> findAllEmployees() {
        return dao.findAllEmployees();
    }
 
    public void deleteEmployeeBySsn(String ssn) {
        dao.deleteEmployeeBySsn(ssn);
    }
 
    public Employee findBySsn(String ssn) {
        return dao.findBySsn(ssn);
    }
 
    public void updateEmployee(Employee employee){
        dao.updateEmployee(employee);
    }
}
package org.springcore.mockito.service;

import static org.junit.Assert.*;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springcore.mockito.dao.EmployeeDao;
import org.springcore.mockito.model.Employee;

@RunWith(MockitoJUnitRunner.class) 
public class EmployeeManagerTest {

	@InjectMocks
    EmployeeManager manager;
     
    @Mock
    EmployeeDao dao;
 
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
	@Test
	public void testGetEmployeeList() {
		List<Employee> list = new ArrayList<Employee>();
        Employee empOne = new Employee(1, "John", "John", "howtodoinjava@gmail.com");
        Employee empTwo = new Employee(2, "Alex", "kolenchiski", "alexk@yahoo.com");
        Employee empThree = new Employee(3, "Steve", "Waugh", "swaugh@gmail.com");
         
        list.add(empOne);
        list.add(empTwo);
        list.add(empThree);
         
        when(dao.getEmployeeList()).thenReturn(list);
         
        //test
        List<Employee> empList = manager.getEmployeeList();
         
        assertEquals(3, empList.size());
        verify(dao, times(1)).getEmployeeList();
	}

	@Test
	public void testGetEmployeeById() {
		when(dao.getEmployeeById(1)).thenReturn(new Employee(1,"Lokesh","Gupta","user@email.com"));
        
        Employee emp = manager.getEmployeeById(1);
         
        assertEquals("Lokesh", emp.getFirstName());
        assertEquals("Gupta", emp.getLastName());
        assertEquals("user@email.com", emp.getEmail());
	}

	@Test
	public void testAddEmployee() {
		Employee emp = new Employee(1,"Lokesh","Gupta","user@email.com");
        
        manager.addEmployee(emp);
         
        verify(dao, times(1)).addEmployee(emp);
	}


}

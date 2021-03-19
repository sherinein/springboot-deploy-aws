package org.hibernate.api;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.api.model.Employee;
import org.hibernate.api.service.EmployeeService;
import org.joda.time.LocalDate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootHibernateApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootHibernateApplication.class, args);
		EmployeeService service = (EmployeeService) context.getBean("employeeService");

		/*
		 * Create Employee1
		 */
		Employee employee1 = new Employee();
		employee1.setName("Han Yenn");
		employee1.setJoiningDate(new LocalDate(2020, 11, 10));
		employee1.setSalary(new BigDecimal(10000));
		employee1.setSsn("ssn00000001");

		/*
		 * Create Employee2
		 */
		/*
		 * Employee employee2 = new Employee(); employee2.setName("Dan Thomas");
		 * employee2.setJoiningDate(new LocalDate(2012, 11, 11));
		 * employee2.setSalary(new BigDecimal(20000)); employee2.setSsn("ssn00000002");
		 * 
		 * 
		 * 
		 * Persist both Employees
		 * 
		 * service.saveEmployee(employee1); service.saveEmployee(employee2);
		 * 
		 * 
		 * Get all employees list from database
		 * 
		 * List<Employee> employees = service.findAllEmployees(); for (Employee emp :
		 * employees) { System.out.println(emp); }
		 * 
		 * 
		 * delete an employee
		 * 
		 * service.deleteEmployeeBySsn("ssn00000002");
		 * 
		 * 
		 * update an employee
		 * 
		 * 
		 * Employee employee = service.findBySsn("ssn00000001"); employee.setSalary(new
		 * BigDecimal(50000)); service.updateEmployee(employee);
		 * 
		 * 
		 * Get all employees list from database
		 * 
		 * List<Employee> employeeList = service.findAllEmployees(); for (Employee emp :
		 * employeeList) { System.out.println(emp); }
		 * 
		 */
	}

}

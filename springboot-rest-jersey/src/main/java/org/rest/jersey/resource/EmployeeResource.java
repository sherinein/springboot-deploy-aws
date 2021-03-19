package org.rest.jersey.resource;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.rest.jersey.dao.EmployeeDao;
import org.rest.jersey.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

@Path("/employeeResource")
public class EmployeeResource {
	@Autowired
	private EmployeeDao employeeDao;
	//to save employee
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/save")
	public Employee saveEmployee(Employee employee) {
		return employeeDao.save(employee);
	}

	
	// get all employee
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/getAllEmployees")
	public List<Employee> getAllEmployees(){
		return employeeDao.findAll();
	}
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/getEmployee/{name}")
	public List<Employee> getEmployeeByName(@PathParam("name") String name) {
		return employeeDao.findByNameEquals(name);
	}
	
	/*
	 * // update employee
	 * 
	 * @PUT
	 * 
	 * @Consumes("application/json")
	 * 
	 * @Produces("application/json")
	 * 
	 * @Path("/updateEmployee/{name}") public List<Employee>
	 * updateEmployeeByName(@PathParam("name") String name) { Employee
	 * updateEmployee=employeeDao.findByName(name); updateEmployee.setName(name);
	 * employeeDao.save(updateEmployee); return employeeDao.save(updateEmployee); }
	 * 
	 * 
	 * //delete employee
	 * 
	 * @DELETE
	 * 
	 * @Consumes("application/json")
	 * 
	 * @Produces("application/json")
	 * 
	 * @Path("/deleteEmployee/{name}") public List<Employee>
	 * deleteEmployeeByName(@PathParam("name") String name) { return
	 * employeeDao.findByName(name); }
	 */
}

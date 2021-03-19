package org.dxc.apachecxf.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.dxc.apachecxf.model.Patient;


@Consumes("application/json")
@Produces("application/json")
@Path("/patientservice")
public interface PatientService {
	
	// get all patients
	@GET
	@Path("/patients")
	List<Patient> getPatients();
	// get one patient
	@GET
	@Path("/patients/{id}")
	Patient getPatient(@PathParam(value="id")Long id);
	
	// save patient
	@POST
	@Path("/patients")
	Response createPatient(Patient patient);
	
	//update patient
	@PUT
	@Path("/patients")
	Response updatePatient(Patient patient);
	
	
	//delete patient
	@DELETE
	@Path("/patients/{id}")
	Response deletePatient(@PathParam(value="id")Long id);
	
	
	
	
	
}






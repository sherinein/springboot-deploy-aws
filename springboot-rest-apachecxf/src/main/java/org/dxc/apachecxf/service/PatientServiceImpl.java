package org.dxc.apachecxf.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.Response;

import org.dxc.apachecxf.exception.PatientNotFoundException;
import org.dxc.apachecxf.model.Patient;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {

	Map<Long, Patient> patients = new HashMap<>();

	public PatientServiceImpl() {
		Patient patient1 = new Patient(123, "Ramu", "fever");
		Patient patient2 = new Patient(124, "Priya", "cold");
		Patient patient3 = new Patient(125, "Banu", "fever");

		patients.put(patient1.getId(), patient1);
		patients.put(patient2.getId(), patient2);
		patients.put(patient3.getId(), patient3);
	}

	@Override
	public List<Patient> getPatients() {
		Collection<Patient> result = patients.values();

		List<Patient> response = new ArrayList<>(result);

		return response;
	}

	@Override
	public Patient getPatient(Long id) {
		if (patients.get(id) == null)
			throw new PatientNotFoundException();
		return patients.get(id);
	}

	@Override
	public Response createPatient(Patient patient) {
		patients.put(patient.getId(), patient);
		return Response.ok(patient).build();
	}

	@Override
	public Response updatePatient(Patient patient) {
		Patient currentPatient = patients.get(patient.getId());
		Response response;

		if (currentPatient != null) {
			patients.put(patient.getId(), patient);
			response = Response.ok().build();
		} else {
			throw new PatientNotFoundException();
		}

		return response;
	}

	@Override
	public Response deletePatient(Long id) {
		Patient currentPatient = patients.get(id);
		Response response;

		if (currentPatient != null) {
			patients.remove(id);
			response = Response.ok().build();
		} else
			response=Response.notModified().build();
		
		return response;
	}

}

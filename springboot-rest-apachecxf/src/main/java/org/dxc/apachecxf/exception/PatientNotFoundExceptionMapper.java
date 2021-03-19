package org.dxc.apachecxf.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.springframework.beans.factory.annotation.Value;
@Provider
public class PatientNotFoundExceptionMapper implements ExceptionMapper<PatientNotFoundException>{

	@Value("${message.PatientNotFound}")
	private String message;
	
	@Override
	public Response toResponse(PatientNotFoundException exception) {
		
		return Response.serverError().entity(message).type(MediaType.APPLICATION_JSON).build();
	}

}

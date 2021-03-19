package org.dxc.rest.config;

import org.dxc.rest.resources.EmployeeResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class RestConfig extends ResourceConfig{

	public RestConfig(Class<?>... classes) {
		super(classes);
		register(EmployeeResource.class);
	}
	
	
	
}

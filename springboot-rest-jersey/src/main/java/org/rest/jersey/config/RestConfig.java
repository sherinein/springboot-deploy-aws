package org.rest.jersey.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.rest.jersey.resource.EmployeeResource;
import org.springframework.stereotype.Component;
@Component
public class RestConfig extends ResourceConfig {

	public RestConfig(Class<?>... classes) {
		super(classes);
		register(EmployeeResource.class);
	}

}

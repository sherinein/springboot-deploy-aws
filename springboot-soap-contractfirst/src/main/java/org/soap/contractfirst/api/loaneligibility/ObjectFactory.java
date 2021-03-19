package org.soap.contractfirst.api.loaneligibility;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

	public ObjectFactory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CustomerRequest createCustomerRequest() {
		return new CustomerRequest();
	}
	
	public Acknowledgement createAcknowledgement() {
		return new Acknowledgement();
	}
}

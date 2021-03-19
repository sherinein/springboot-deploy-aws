package org.soap.contractfirst.api.endpoint;

import org.soap.contractfirst.api.loaneligibility.Acknowledgement;
import org.soap.contractfirst.api.loaneligibility.CustomerRequest;
import org.soap.contractfirst.api.service.LoanEligibilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class LoanEligibilityIndicatorEndPoint {
	private static final String NAMESPACE="http://www.example.org/loaneligibility";
	@Autowired
	private LoanEligibilityService service;
	@PayloadRoot(namespace=NAMESPACE ,localPart="CustomerRequest")
	@ResponsePayload
	public Acknowledgement getLoanStatus(@RequestPayload CustomerRequest request) {
		return service.checkLoanEligibility(request);
	}
	
}

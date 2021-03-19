package com.cts.renibuilders.service;

import org.springframework.stereotype.Service;

import com.cts.renibuilders.exception.InValidCityException;
import com.cts.renibuilders.model.Customer;

@Service
public class ApartmentService {

	public long calculateestimateCost(Customer customer) {
		String Availablecity = "Chennai";
		long estimateCost = 0;
		if (!Availablecity.equalsIgnoreCase(customer.getCity())) {
			System.out.println("city not available");
			throw new InValidCityException(customer.getCity());
		} else if (customer.getPropertyType().equals("1 BHK")) {
			estimateCost = 6000000;
		} else
			estimateCost = 8000000;

		return estimateCost;
	}

	

}

package com.cts.renibuilders.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cts.renibuilders.exception.InValidCityException;
import com.cts.renibuilders.model.Customer;


class ApartmentServiceTest {
	ApartmentService apartmentService;

	@BeforeTest
	void setUp() throws Exception {
		apartmentService=new ApartmentService();
	}


	@Test
	void testWhetherCustomerSelectedIsValidCityWithPropertyType1BHK() {
		long expectedestimatecost=6000000;
		Customer customer=new Customer();
		customer.setCustomerName("Athi Devaraj");
		customer.setEmailId("athi@gmail.com");
		customer.setMobileNo("7865489547");
		customer.setCity("Chennai");
		customer.setPropertyType("1 BHK");
		long actualestimatecost=apartmentService.calculateestimateCost(customer);
		System.out.println(actualestimatecost);
		assertEquals(expectedestimatecost,actualestimatecost);
	}
	@Test
	void testWhetherCustomerSelectedIsValidCityWithPropertyType2BHK() {
		long expectedestimatecost=8000000;
		Customer customer=new Customer();
		customer.setCustomerName("Athi Devaraj");
		customer.setEmailId("athi@gmail.com");
		customer.setMobileNo("7865489547");
		customer.setCity("Chennai");
		customer.setPropertyType("2 BHK");
		long actualestimatecost=apartmentService.calculateestimateCost(customer);
		System.out.println(actualestimatecost);
		assertEquals(expectedestimatecost,actualestimatecost);
	}
	@Test
	void testWhetherCustomerSelectedIsNotValidCity() throws InValidCityException {
		Customer customer=new Customer();
		customer.setCustomerName("Athi Devaraj");
		customer.setEmailId("athi@gmail.com");
		customer.setMobileNo("7865489547");
		customer.setCity("Bangalore");
		customer.setPropertyType("2 BHK");
		Assertions.assertThrows(InValidCityException.class, ()->{
			apartmentService.calculateestimateCost(customer);
		});	
	}
	
	
	@AfterTest
	void tearDown() throws Exception {
		apartmentService=null;
	}
}

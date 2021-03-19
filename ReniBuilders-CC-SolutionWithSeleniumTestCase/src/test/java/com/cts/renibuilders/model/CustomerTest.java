package com.cts.renibuilders.model;

import static org.junit.Assert.assertEquals;



import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


class CustomerTest {
	
	Customer customer;

	@BeforeTest
	void setUp() throws Exception {
		customer=new Customer();
		customer.setCustomerName("Athi Devaraj");
		customer.setEmailId("athi@gmail.com");
		customer.setMobileNo("7865489547");
		customer.setCity("Chennai");
		customer.setPropertyType("1 BHK");
	}

	
	@Test
	public void testExpectedName() {
		String expectedName = "Athi Devaraj";
		assertEquals(expectedName, customer.getCustomerName());
	}
	
	@Test
	public void testExpectedEmailId() {
		String expectedEmailId = "athi@gmail.com";
		assertEquals(expectedEmailId, customer.getEmailId());
	}
	@Test
	public void testMobileNo() {
		String expectedMobileNo = "7865489547";
		assertEquals(expectedMobileNo, customer.getMobileNo());
	}
	@Test
	public void testCity() {
		String expectedCity = "Chennai";
		assertEquals(expectedCity, customer.getCity());
	}

	@Test
	public void testpropertyType() {
		String expectedpropertyType = "1 BHK";
		assertEquals(expectedpropertyType, customer.getPropertyType());
	}
	
	@AfterTest
	public void tearDown() {
		customer = null;
	}

	
}

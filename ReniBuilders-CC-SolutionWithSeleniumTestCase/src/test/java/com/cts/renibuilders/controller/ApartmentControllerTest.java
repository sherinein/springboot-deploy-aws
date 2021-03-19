package com.cts.renibuilders.controller;

import static org.junit.Assert.assertSame;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.testng.Assert.assertNotNull;


import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cts.renibuilders.model.Customer;
import com.cts.renibuilders.service.ApartmentService;

@SpringBootTest(classes = ApartmentController.class)
class ApartmentControllerTest {
	private MockMvc mockMvc;
	
	@Autowired
	@InjectMocks
	ApartmentService apartmentService=null;
	@Autowired
    @InjectMocks
	ApartmentController apartmentController=null;
		

	Customer customer;
	
	@BeforeMethod
	void setUp() throws Exception {
		//apartmentcontroller=new ApartmentController(apartmentService);
		MockitoAnnotations.initMocks(this);
		
		//System.out.println("apartmentService"+apartmentService);
		//System.out.println("apartmentcontroller"+apartmentcontroller);
		mockMvc = MockMvcBuilders.standaloneSetup(apartmentController).setControllerAdvice(new GlobalExceptionHandler()).build();
		//apartmentService=org.mockito.Mockito.mock(ApartmentService.class);
		  apartmentService= Mockito.mock(ApartmentService.class);
		customer=new Customer();
		customer.setCustomerName("Antony Prakash");
		customer.setEmailId("antony@gmail.com");
		customer.setMobileNo("9893573259");
		customer.setCity("Chennai");
		customer.setPropertyType("2 BHK");
	}

	@Test
	void testShowSearchApartment() throws Exception {
		mockMvc.perform(get("/")).andExpect(status().isOk()).andExpect(view().name("searchapartment"));
	}
	
	
	
	@Test
	public void testcalculateestimateCostActive() throws Exception {

		long estimateCost=8000000;
		Mockito.when(apartmentService.calculateestimateCost(any())).thenReturn(estimateCost);
		mockMvc.perform(post("/estimatecost").contentType(MediaType.APPLICATION_FORM_URLENCODED)
				.param("customerName", "Antony Prakash").param("mobileNo", "9893573259 ")
				.param("emailId", "antony@gmail.com").param("city", "Chennai").param("propertyType", "2 BHK"))
				.andExpect(status().isOk()).andExpect(view().name("searchapartment"));

	}

	@Test
	public void testPostCustomerDetailsFormValidationFail() throws Exception {
		long estimateCost = 0;
		Mockito.when(apartmentService.calculateestimateCost(any())).thenReturn(estimateCost);
		mockMvc.perform(
				post("/estimatecost").contentType(MediaType.APPLICATION_FORM_URLENCODED).param("customerName", " ")
						.param("mobileNo", " ").param("emailId", " ").param("city", "").param("propertyType", "1 BHK"))
				.andExpect(status().isOk()).andExpect(model().attributeExists("customer"))
				.andExpect(view().name("searchapartment"));
	}

	@AfterMethod
	void tearDown() throws Exception {
		mockMvc = null;
		apartmentService = null;
		apartmentController = null;
	}

}

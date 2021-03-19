package com.cts.renibuilders.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.renibuilders.model.Customer;
import com.cts.renibuilders.service.ApartmentService;

@Controller
public class ApartmentController {
	@Autowired
	ApartmentService apartmentService;

	/*
	 * @Autowired public ApartmentController(ApartmentService apartmentService) {
	 * super(); this.apartmentService = apartmentService; }
	 */

	@RequestMapping("/")
	public String showSearchApartment(@ModelAttribute("customer") Customer customer) {
		customer.setPropertyType("1 BHK");
		return "searchapartment";
	}

	@RequestMapping(value = "/estimatecost", method = RequestMethod.POST)
	public String calculateestimateCost(@Valid @ModelAttribute("customer") Customer customer, BindingResult result,
			Model model) {
		long estimatecost = 0L;
		String view;
		if (result.hasErrors()) {
			view = "searchapartment";
			// System.out.println("binding error");
		} else {
			estimatecost = apartmentService.calculateestimateCost(customer);
			model.addAttribute("cost", estimatecost);
			System.out.println("estimate cost" + estimatecost);
			view = "result";
		}
		return view;
	}

}

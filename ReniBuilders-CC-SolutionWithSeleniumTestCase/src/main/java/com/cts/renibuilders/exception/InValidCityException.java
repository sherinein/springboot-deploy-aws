package com.cts.renibuilders.exception;

public class InValidCityException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	String city;

	public InValidCityException(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "No projects in " + city;
	}
}

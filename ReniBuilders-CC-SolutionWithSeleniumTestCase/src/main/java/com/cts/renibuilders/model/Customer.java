package com.cts.renibuilders.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

public class Customer {
	@Length(min=4,max=15,message="Customer name must be 4 to 15 characters")
	private String customerName;
	@Pattern(regexp="(^$|[0-9]{10})",message="Mobile number must be 10 digit")
	@NotEmpty(message="Mobile number must not be empty")
	private String mobileNo;
	@Email(message = "Email should be valid")
	@NotEmpty(message="Email can't be empty")
	private String emailId;
	@NotEmpty(message="City can't be empty")
	private String city;
	
	private String propertyType;
	
	public String getCity() {
		return city;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	
	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setCity(String city) {
		this.city = city;
	}

	

	@NotNull(message="Property Type must not be null")
	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	
}

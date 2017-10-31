package edu.shekhar.smartfinance.openinvoice.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.Size;

public class CustomerDetails {

	@Size(min = 11, max = 11)
	private String socialSecurityNumber;
	private String firstName;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String middleName;
	private String surName;
	private String customerIPAddress;
	private String customerLanguage;

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getCustomerIPAddress() {
		return customerIPAddress;
	}

	public void setCustomerIPAddress(String customerIPAddress) {
		this.customerIPAddress = customerIPAddress;
	}

	public String getCustomerLanguage() {
		return customerLanguage;
	}

	public void setCustomerLanguage(String customerLanguage) {
		this.customerLanguage = customerLanguage;
	}
}

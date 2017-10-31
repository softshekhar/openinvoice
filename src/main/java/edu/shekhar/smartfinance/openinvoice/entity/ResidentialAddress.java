package edu.shekhar.smartfinance.openinvoice.entity;

import javax.validation.constraints.Size;

public class ResidentialAddress {

	private String coAddress;
	private String streetAddress;
	private String postCode;
	@Size(max = 10)
	private String postTown;

	public String getCoAddress() {
		return coAddress;
	}

	public void setCoAddress(String coAddress) {
		this.coAddress = coAddress;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getPostTown() {
		return postTown;
	}

	public void setPostTown(String postTown) {
		this.postTown = postTown;
	}
}

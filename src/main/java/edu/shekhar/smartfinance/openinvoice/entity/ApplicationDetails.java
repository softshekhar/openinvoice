package edu.shekhar.smartfinance.openinvoice.entity;

import javax.validation.constraints.Size;

public class ApplicationDetails {

	private Long creditApplicationId;
	private String result;
	private Integer amount;
	@Size(min = 10, max = 16)
	private String customerNumber;
	@Size(min = 1, max = 50)
	private String orderIdentifier;
	private Boolean authenticationNeeded;
	private Boolean authenticationComplete;
	private String authenticationReference;

	public Long getCreditApplicationId() {
		return creditApplicationId;
	}

	public void setCreditApplicationId(Long creditApplicationId) {
		this.creditApplicationId = creditApplicationId;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getOrderIdentifier() {
		return orderIdentifier;
	}

	public void setOrderIdentifier(String orderIdentifier) {
		this.orderIdentifier = orderIdentifier;
	}

	public Boolean getAuthenticationNeeded() {
		return authenticationNeeded;
	}

	public void setAuthenticationNeeded(Boolean authenticationNeeded) {
		this.authenticationNeeded = authenticationNeeded;
	}

	public Boolean getAuthenticationComplete() {
		return authenticationComplete;
	}

	public void setAuthenticationComplete(Boolean authenticationComplete) {
		this.authenticationComplete = authenticationComplete;
	}

	public String getAuthenticationReference() {
		return authenticationReference;
	}

	public void setAuthenticationReference(String authenticationReference) {
		this.authenticationReference = authenticationReference;
	}
}

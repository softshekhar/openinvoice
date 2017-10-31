package edu.shekhar.smartfinance.openinvoice.entity;

public class OpenInvoiceResponse {

	private Long creditApplicationId;
	private ApplicationDetails applicationDetails;
	private CustomerDetails customerDetails;
	private ResidentialAddress residentialAddress;
	private TupasDetails tupasDetails;

	public Long getCreditApplicationId() {
		return creditApplicationId;
	}

	public void setCreditApplicationId(Long creditApplicationId) {
		this.creditApplicationId = creditApplicationId;
	}

	public ApplicationDetails getApplicationDetails() {
		return applicationDetails;
	}

	public void setApplicationDetails(ApplicationDetails applicationDetails) {
		this.applicationDetails = applicationDetails;
	}

	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}

	public ResidentialAddress getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(ResidentialAddress residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	public TupasDetails getTupasDetails() {
		return tupasDetails;
	}

	public void setTupasDetails(TupasDetails tupasDetails) {
		this.tupasDetails = tupasDetails;
	}
}

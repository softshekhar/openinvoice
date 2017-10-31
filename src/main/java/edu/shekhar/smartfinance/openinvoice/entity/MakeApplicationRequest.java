package edu.shekhar.smartfinance.openinvoice.entity;

public class MakeApplicationRequest {

	private String productID;
	private String productCode;
	private Integer applicationChannel;
	private String orderID;
	private Integer orderAmount;
	private String callbackURL;
	private String gatewayTransactionID;
	private CustomerDetails customerDetails;
	private ResidentialAddress residentialAddress;

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Integer getApplicationChannel() {
		return applicationChannel;
	}

	public void setApplicationChannel(Integer applicationChannel) {
		this.applicationChannel = applicationChannel;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public Integer getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Integer orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getCallbackURL() {
		return callbackURL;
	}

	public void setCallbackURL(String callbackURL) {
		this.callbackURL = callbackURL;
	}

	public String getGatewayTransactionID() {
		return gatewayTransactionID;
	}

	public void setGatewayTransactionID(String gatewayTransactionID) {
		this.gatewayTransactionID = gatewayTransactionID;
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
}

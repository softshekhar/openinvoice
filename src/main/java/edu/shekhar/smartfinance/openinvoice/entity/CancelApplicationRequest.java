package edu.shekhar.smartfinance.openinvoice.entity;

public class CancelApplicationRequest {

	private Long creditApplicationId;
	private String cancelType;

	public Long getCreditApplicationId() {
		return creditApplicationId;
	}

	public void setCreditApplicationId(Long creditApplicationId) {
		this.creditApplicationId = creditApplicationId;
	}

	public String getCancelType() {
		return cancelType;
	}

	public void setCancelType(String cancelType) {
		this.cancelType = cancelType;
	}
}

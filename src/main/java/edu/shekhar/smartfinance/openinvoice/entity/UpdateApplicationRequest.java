package edu.shekhar.smartfinance.openinvoice.entity;

public class UpdateApplicationRequest {

	private Long creditApplicationId;
	private TupasDetails tupasDetails;

	public Long getCreditApplicationId() {
		return creditApplicationId;
	}

	public void setCreditApplicationId(Long creditApplicationId) {
		this.creditApplicationId = creditApplicationId;
	}

	public TupasDetails getTupasDetails() {
		return tupasDetails;
	}

	public void setTupasDetails(TupasDetails tupasDetails) {
		this.tupasDetails = tupasDetails;
	}
}

package edu.shekhar.smartfinance.openinvoice.util;

public enum OpenInvoiceApplicationResult {

	APPROVED("approved"),
	DECLINED("declined"),
	PENDING("pending"),
	CANCELLED("cancelled"),
	ERROR("error");

	private final String value;

	OpenInvoiceApplicationResult(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return this.value;
	}
}

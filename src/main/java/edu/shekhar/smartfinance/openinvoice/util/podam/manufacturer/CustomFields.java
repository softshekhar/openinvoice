package edu.shekhar.smartfinance.openinvoice.util.podam.manufacturer;

public enum CustomFields {

	FIRSTNAME("firstName"),

	MIDDLENAME("middleName"),

	SURNAME("surName");

	private final String value;

	CustomFields(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return this.value;
	}
}

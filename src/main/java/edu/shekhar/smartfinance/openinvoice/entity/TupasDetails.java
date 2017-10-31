package edu.shekhar.smartfinance.openinvoice.entity;

public class TupasDetails {

	private String bankCode;
	private String hash;
	private String identificationTime;
	private String socialSecurityNumber;
	private String statusCode;
	private String tupasID;
	private String tupasRequestID;
	private String tupasVersion;

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getIdentificationTime() {
		return identificationTime;
	}

	public void setIdentificationTime(String identificationTime) {
		this.identificationTime = identificationTime;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getTupasID() {
		return tupasID;
	}

	public void setTupasID(String tupasID) {
		this.tupasID = tupasID;
	}

	public String getTupasRequestID() {
		return tupasRequestID;
	}

	public void setTupasRequestID(String tupasRequestID) {
		this.tupasRequestID = tupasRequestID;
	}

	public String getTupasVersion() {
		return tupasVersion;
	}

	public void setTupasVersion(String tupasVersion) {
		this.tupasVersion = tupasVersion;
	}
}

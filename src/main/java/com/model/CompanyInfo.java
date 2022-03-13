package com.model;

import org.springframework.stereotype.Component;

@Component
public class CompanyInfo {
	private String companyID;
	private String companyName;
	private String companyEmail;

	public String getCompanyID() {
		return companyID;
	}

	public void setCompanyID(String companyID) {
		this.companyID = companyID;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyEmail() {
		return companyEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	@Override
	public String toString() {
		return "CompanyInfo [companyID=" + companyID + ", companyName=" + companyName + ", companyEmail=" + companyEmail
				+ "]";
	}
}

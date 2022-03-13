package com.model;

public class JobSearch {
	private String jobKeyword;
	private int expectedSalary;
	private String location;

	public String getJobKeyword() {
		return jobKeyword;
	}

	public void setJobKeyword(String jobKeyword) {
		this.jobKeyword = jobKeyword;
	}

	public int getExpectedSalary() {
		return expectedSalary;
	}

	public void setExpectedSalary(int expectedSalary) {
		this.expectedSalary = expectedSalary;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "JobSearch [jobKeyword=" + jobKeyword + ", expectedSalary=" + expectedSalary + ", location=" + location
				+ "]";
	}

}

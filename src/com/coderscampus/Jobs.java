package com.coderscampus;

public class Jobs {

	private String title;
	private String company;
	private String compensation;

	public Jobs(String title, String company, String compensation) {
		super();
		this.title = title;
		this.company = company;
		this.compensation = compensation;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompensation() {
		return compensation;
	}

	public void setCompensation(String compensation) {
		this.compensation = compensation;
	}

	@Override
	public String toString() {
		return title + company + compensation;
	}
}
package com.mmtspl.cloudconfigdbservice.model;

public class HostDetails {

	private String localHostAddress;
	
	public HostDetails() {
		
	}
	
	public HostDetails(String localHostAddress) {
		this.localHostAddress = localHostAddress;
	}

	public String getLocalHostAddress() {
		return localHostAddress;
	}

	public void setLocalHostAddress(String localHostAddress) {
		this.localHostAddress = localHostAddress;
	}
	
	
}


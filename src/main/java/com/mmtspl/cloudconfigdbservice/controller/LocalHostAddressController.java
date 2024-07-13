package com.mmtspl.cloudconfigdbservice.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mmtspl.cloudconfigdbservice.model.HostDetails;
import com.mmtspl.cloudconfigdbservice.model.MySQLBDUrls;

//@CrossOrigin(origins = "http://localhost:5000")
@CrossOrigin(origins = {"${settings.cors_origin}"})
@RestController 
@RequestMapping("/cloud-config-db-service-local-host")
public class LocalHostAddressController {

	private HostDetails hostDetails;
	
	@GetMapping("/getLocalHostAddress")  
	public HostDetails getLocalHostAddress()  
	{ 
		hostDetails = new HostDetails();
		String localHostAddress = "127.0.0.1";
		try {
		    localHostAddress = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
		    e.printStackTrace();
		}
		
		hostDetails.setLocalHostAddress(localHostAddress);
		
	    System.out.println("localHostAddress :: " + localHostAddress);
		return hostDetails;
	}
}

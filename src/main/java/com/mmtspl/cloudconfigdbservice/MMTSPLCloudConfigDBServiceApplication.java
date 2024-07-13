package com.mmtspl.cloudconfigdbservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableHystrix
//@EnableDiscoveryClient
public class MMTSPLCloudConfigDBServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MMTSPLCloudConfigDBServiceApplication.class, args);
	}

}

package com.mmtspl.cloudconfigdbservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mmtspl.cloudconfigdbservice.configuration.MySQLBDUrlsCloudConfiguration;
import com.mmtspl.cloudconfigdbservice.model.MySQLBDUrls;
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;  

@RestController 
@RequestMapping("/cloud-config-db-service")
public class MySQLBDUrlsController   
{  
	@Autowired
	MySQLBDUrlsCloudConfiguration mySQLBDUrlsCloudConfiguration;
	
	@GetMapping("/mysql-db-cloud-urls")  
	public MySQLBDUrls retriveEmployeeServiceFrontControllerUrlsConfiguration()  
	{  
		//getting values from the properties file  
		return new MySQLBDUrls(mySQLBDUrlsCloudConfiguration.getServerIPv4Address(),
				mySQLBDUrlsCloudConfiguration.getDriver(), 
				mySQLBDUrlsCloudConfiguration.getUrl(),
				mySQLBDUrlsCloudConfiguration.getUsername(),
				mySQLBDUrlsCloudConfiguration.getPassword(),
				mySQLBDUrlsCloudConfiguration.getHibernate_dialect(),
				mySQLBDUrlsCloudConfiguration.getHibernate_show_sql(),
				mySQLBDUrlsCloudConfiguration.getHibernate_hbm2ddl_auto(),
				mySQLBDUrlsCloudConfiguration.getEntitymanager_packagesToScan(),
				mySQLBDUrlsCloudConfiguration.getSpring_jpa_properties_hibernate_enable_lazy_load_no_trans());  
		
	}  
	
	/*
	@GetMapping("/fault-tolerance-example")
	// configuring a fallback method
	@HystrixCommand(fallbackMethod = "fallbackRetrieveConfigurations")
	public LimitConfiguration retrieveConfigurations() {
		throw new RuntimeException("Not Available");
	}

	// defining the fallback method
	public LimitConfiguration fallbackRetrieveConfigurations() {
		// returning the default configuration
		return new LimitConfiguration(234, 76);
	} 
	*/
}  
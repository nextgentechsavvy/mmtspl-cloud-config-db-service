package com.mmtspl.cloudconfigdbservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;  
import org.springframework.stereotype.Component;  


@Component  
@ConfigurationProperties("mmtspl-mysql-db")
public class MySQLBDUrlsCloudConfiguration   
{  
	private String serverIPv4Address;
	private String driver;  
	private String url;  
	private String username;
	private String password;
	
	private String hibernate_dialect;
	private String hibernate_show_sql;
	private String hibernate_hbm2ddl_auto;
	private String entitymanager_packagesToScan;
	private String spring_jpa_properties_hibernate_enable_lazy_load_no_trans;
	

	public String getServerIPv4Address() {
		return serverIPv4Address;
	}
	public void setServerIPv4Address(String serverIPv4Address) {
		this.serverIPv4Address = serverIPv4Address;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHibernate_dialect() {
		return hibernate_dialect;
	}
	public void setHibernate_dialect(String hibernate_dialect) {
		this.hibernate_dialect = hibernate_dialect;
	}
	public String getHibernate_show_sql() {
		return hibernate_show_sql;
	}
	public void setHibernate_show_sql(String hibernate_show_sql) {
		this.hibernate_show_sql = hibernate_show_sql;
	}
	public String getHibernate_hbm2ddl_auto() {
		return hibernate_hbm2ddl_auto;
	}
	public void setHibernate_hbm2ddl_auto(String hibernate_hbm2ddl_auto) {
		this.hibernate_hbm2ddl_auto = hibernate_hbm2ddl_auto;
	}
	public String getEntitymanager_packagesToScan() {
		return entitymanager_packagesToScan;
	}
	public void setEntitymanager_packagesToScan(String entitymanager_packagesToScan) {
		this.entitymanager_packagesToScan = entitymanager_packagesToScan;
	}
	public String getSpring_jpa_properties_hibernate_enable_lazy_load_no_trans() {
		return spring_jpa_properties_hibernate_enable_lazy_load_no_trans;
	}
	public void setSpring_jpa_properties_hibernate_enable_lazy_load_no_trans(
			String spring_jpa_properties_hibernate_enable_lazy_load_no_trans) {
		this.spring_jpa_properties_hibernate_enable_lazy_load_no_trans = spring_jpa_properties_hibernate_enable_lazy_load_no_trans;
	}
	

}  


package com.tyss.springcore.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

public class Car implements Serializable{
private String company;


 @Autowired (required = false)

private Engine engine;
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public Engine getEngine() {
	return engine;
}
public void setEngine(Engine engine) {
	this.engine = engine;
}


 

}

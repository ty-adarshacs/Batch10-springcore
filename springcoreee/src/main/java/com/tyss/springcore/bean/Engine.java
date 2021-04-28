package com.tyss.springcore.bean;

import java.io.Serializable;

public class Engine implements Serializable{
	private int cc;
	private String type;
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}

package com.tyss.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.bean.Car;

public class Cartest {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("carconfig.xml");
		Car cc=context.getBean("car",Car.class);
		
		System.out.println(cc.getCompany());
		System.out.println(cc.getEngine().getCc());
		System.out.println(cc.getEngine().getType());
	}

}

package com.ssafy.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		
		System.out.println("1~~");
		Programmer p = (Programmer) context.getBean("programmer");
		Desktop d = context.getBean("desktop", Desktop.class);
		p.setComputer(d);
		
		System.out.println("2~~~");
		
		p.coding();
		
		
		Desktop d2 = context.getBean("desktop", Desktop.class);
		
		System.out.println(d == d2);
	}
}

package com.ssafy.proxy2;

public class Test {
	public static void main(String[] args) {
		Programmer p = new Programmer();
		
		PersonProxy px = new PersonProxy();
		
		px.setPerson(p);
		
		px.coding();
	}
}

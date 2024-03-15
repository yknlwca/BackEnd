package com.ssafy.di3_타입의존성제거;

public class Test {
	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		// 프로그래머가 데스크톱에 대한 의존성을 가지고 있음
		Programmer p = new Programmer(desktop);

		p.coding();
		
		Laptop laptop = new Laptop();
		Programmer p2 = new Programmer(laptop);
		p2.coding();
		
		
	}
}

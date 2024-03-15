package com.ssafy.di3_타입의존성제거;

public class Programmer {
	private Computer computer;
	
	
	// 객체 생성 의존성 제거
	public Programmer(Computer computer) {
		this.computer = computer;
	}

	
	public void coding() {
		System.out.println(computer.getInfo() + "으로 개발을 합니다.");
	}
}

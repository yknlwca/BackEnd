package com.ssafy.di2_객체의존성제거;

public class Programmer {
	private Desktop desktop;
	
	
	// 객체 생성 의존성 제거
	public Programmer(Desktop desktop) {
		this.desktop = desktop;
	}

	public void coding() {
		System.out.println(desktop.getInfo() + "으로 개발을 합니다.");
	}
}

package com.ssafy.di2;

public class Desktop implements Computer {
	// 필드명 작성
	// CPU, GPU, RAM ....

	public Desktop() {
		System.out.println("데스크탑이 생성되었습니다.");
	}
	
	// 정보를 반환
	public String getInfo() {
		return "데스크톱";
	}
}

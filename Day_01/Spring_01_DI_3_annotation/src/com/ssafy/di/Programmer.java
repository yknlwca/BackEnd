package com.ssafy.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="p")
public class Programmer {
//	@Autowired
//	private final Computer computer;
	private Computer computer;

	public Programmer() {
	}

	// 객체 생성 의존성 제거
	@Autowired
	public Programmer(Computer computer) {
		this.computer = computer;
	}

	// 설정자 주입
	@Autowired
	public void setComputer(Computer computer) {
		this.computer = computer;
	}

	// 메서드 주입 (여러개를 동시에 주입하려고 할때)
//	public void init(Computer computer, Keyboard keyboard) {
//		this.computer = computer;
//		this.keyboard = keyboard
//	}

	public void coding() {
		System.out.println(computer.getInfo() + "으로 개발을 합니다.");
	}
}

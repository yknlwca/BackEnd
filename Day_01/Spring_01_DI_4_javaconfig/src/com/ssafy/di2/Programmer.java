package com.ssafy.di2;

public class Programmer {

	private Computer computer;

	public Programmer() {
	}

	public Programmer(Computer computer) {
		this.computer = computer;
	}


	public void setComputer(Computer computer) {
		this.computer = computer;
	}


	public void coding() {
		System.out.println(computer.getInfo() + "으로 개발을 합니다.");
	}
}

package com.ssafy.aop;

import java.util.Random;

public class Programmer implements Person {
	public int coding() throws OuchException {

		System.out.println("열심히 코드를 작성한다."); // 핵심 관심 사항
		if (new Random().nextBoolean()) {
			throw new OuchException();
		}
		return (int) (Math.random() * 100) + 1;
	}
}
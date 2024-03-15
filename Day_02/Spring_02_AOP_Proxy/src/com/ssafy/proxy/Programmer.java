package com.ssafy.proxy;

import java.util.Random;

public class Programmer {
	public void coding() {
		System.out.println("컴퓨터를 부팅한다.");
		
		try {
			System.out.println("열심히 코드를 작성한다."); // 핵심 관심 사항
			if(new Random().nextBoolean())
				throw new OuchException();
			System.out.println("Git에 Push 한다.");
		}catch (OuchException e) {
			System.out.println("조퇴를 한다.");
			e.handleException();
		}finally {
			System.out.println("보람찬 하루를 마무리한다.");
		}
	}
}

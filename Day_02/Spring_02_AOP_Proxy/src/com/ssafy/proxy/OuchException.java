package com.ssafy.proxy;

public class OuchException extends Exception {

	private static final long serialVersionUID = 1L;

	public void handleException() {
		System.out.println("병원 간다.");
	}
}

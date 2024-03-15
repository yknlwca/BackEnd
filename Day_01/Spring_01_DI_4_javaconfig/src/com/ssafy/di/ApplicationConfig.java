package com.ssafy.di;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class ApplicationConfig {

	@Bean
	public Desktop desktop() {
		return new Desktop();
	}
	
	@Bean
	public Laptop laptop() {
		return new Laptop();
	}
	
	@Bean
	public Programmer programmer() {
		// 생성자 주입, 설정자 주입 둘 다 가능
		Programmer p = new Programmer(desktop());
		return p;
	}
}

package com.ssafy.mvc.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class MyListener2 implements ServletContextListener {

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("웹애플리케이션이 시작될때 호출 1");
	}

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("웹애플리케이션이 종료될때 호출 1");
	}

}

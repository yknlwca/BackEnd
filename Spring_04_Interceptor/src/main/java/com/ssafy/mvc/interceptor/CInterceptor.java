package com.ssafy.mvc.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		// boolean 형태의 반환 타입 true 진행 / false 종료
		System.out.println("C : preHandle");
		
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// 정상 수행 후 실행
		// 예외 발생시 미 실행
		System.out.println("C : postHandle");
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// View가 전달된 후 실행 (무조건)
		// 예외 미 발생시 객체 null 초기화
		System.out.println("C : afterCompletion");
	
	}
	
}

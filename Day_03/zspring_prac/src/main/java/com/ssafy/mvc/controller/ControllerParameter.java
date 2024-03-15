package com.ssafy.mvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ControllerParameter {

	@GetMapping("/test1") // 요청 경로
	public String test1() {

		// 반환타입이 String 이라는 뜻은 해당 값이 ViewName이다.
		return "test1"; // WEB-INF/view/test1.jsp
	}

	// 데이터를 실어서 보내고 싶을 때
	@GetMapping("/test2-1")
	public String test2_1(Model model) {
		model.addAttribute("msg", "데이터");
		return "test2";
	}

	@GetMapping("/test2-2")
	public String test2_2(Map<String, Object> model) {
		model.addAttribute("msg", "데이터2");
		return "test2";
	}

	// 파라미터로 값을 가져오고 싶다
//	@GetMapping("/test3")
//	public String test3(Model model, HttpServletRequest request) {
//		String id = request.getParameter("id");
//		
//		model.addAttribute("id", id);
//		
//		return "test3";
//	}
	
	
	@GetMapping("/test3")
	public String test3(Model model, @RequestParam("id") String id, @RequestParam(value = "pw", default = "24") String pw) {
		model.addAttribute("id", id);
		
		return "test3";
	}

}

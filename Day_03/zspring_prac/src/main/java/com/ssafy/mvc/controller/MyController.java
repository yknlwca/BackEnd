package com.ssafy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "home", method=RequestMethod.GET)
	public ModelAndView homeHandle1() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Welcome to Spring(GET)");
		
		// view이름 결정
		// forwarding
		mav.setViewName("home");
		
		return mav;
	}
	
	@RequestMapping(value = "home", method=RequestMethod.POST)
	public ModelAndView homeHandle2() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Welcome to Spring(POST)");
		
		// view이름 결정
		// forwarding
		mav.setViewName("home");
		
		return mav;
	}
}

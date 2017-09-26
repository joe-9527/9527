package com.zorro.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("test")
public class TestController {
	
	@RequestMapping("test")
	@ResponseBody
	public String test() {
		System.out.println("template.zorro.com");
		return "test template.zorro.com";
	}
	
	@RequestMapping("index")
	public ModelAndView index() {
		return new ModelAndView("/index");
	}
}

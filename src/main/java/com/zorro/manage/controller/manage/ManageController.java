package com.zorro.manage.controller.manage;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zorro.manage.controller.BaseController;
@Controller
@RequestMapping("/manage")
public class ManageController extends BaseController{
	
	@RequestMapping("/index")
	public ModelAndView index() {
		Map<String, String> header = getRequestHeaders();
		for(String key : header.keySet()) {
			System.out.println(key + ":" + header.get(key));
		}
		
		System.out.println();
		
		Map<String, String> params = getRequestParams();
		for(String key : params.keySet()) {
			System.out.println(key + ":" + params.get(key));
		}
		return new ModelAndView("manage/index");
	}
}

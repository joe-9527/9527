package com.zorro.manage.controller.manage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zorro.manage.common.framework.LoginStatusCheck;
import com.zorro.manage.controller.BaseController;
@Controller
@RequestMapping("/manage")
public class ManageController extends BaseController{
	
	@LoginStatusCheck
	@RequestMapping("/index")
	public ModelAndView index() {
		return new ModelAndView("manage/index");
	}
}

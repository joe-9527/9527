package com.zorro.manage.common.framework;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginStatusCheckInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		if (!handler.getClass().isAssignableFrom(HandlerMethod.class)){
			return true;
		}
		
		LoginStatusCheck loginStatusCheck = ((HandlerMethod) handler).getMethodAnnotation(LoginStatusCheck.class);
		if (loginStatusCheck == null) {
			return true;
		}
			
		// 校验登录情况
		
		
		//response.sendRedirect("/manage/index");
		return true;
	}
}

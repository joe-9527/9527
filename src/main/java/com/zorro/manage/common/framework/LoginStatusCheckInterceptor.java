package com.zorro.manage.common.framework;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.google.common.base.Strings;
import com.zorro.manage.common.util.TokenUtil;

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
			
		/**
		 * 校验登录情况
		 */
		String token = null;
		String uid = null;
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if ("token".equals(cookie.getName())) {
					token = cookie.getValue();
				} else if ("uid".equals(cookie.getName())) {
					uid = cookie.getValue();
				}
			}
		}
		
		if (checkTokenIsLegal(uid, token) == true) {
			return true;
		}
		
		// 校验失败
		response.sendRedirect("/user/login");
		return false;
	}

	private boolean checkTokenIsLegal(String uid, String token) {
		if (Strings.isNullOrEmpty(uid) || Strings.isNullOrEmpty(token)) {
			return false;
		}
		
		return TokenUtil.checkToken(uid, token);
	}
}

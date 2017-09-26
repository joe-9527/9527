package com.zorro.manage.controller;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BaseController {
	@Autowired
	protected HttpServletRequest request;
	
	@Autowired
	protected HttpServletResponse response;
	
	protected Map<String, String> getRequestParams() {
		Map<String, String> result = new HashMap<String, String>();

		Enumeration paramNames = request.getParameterNames();
		while (paramNames.hasMoreElements()) {
			String paramName = (String) paramNames.nextElement();
			String paramValue = request.getParameter(paramName);
			result.put(paramName, paramValue);
		}
		
		return result;
	}
	
	protected Map<String, String> getRequestHeaders() {
		Map<String, String> result = new HashMap<String, String>();
		
		Enumeration headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String headerName = (String) headerNames.nextElement();
			String headerValue = request.getHeader(headerName);
			result.put(headerName, headerValue);
		}
		
		return result;
	}
}

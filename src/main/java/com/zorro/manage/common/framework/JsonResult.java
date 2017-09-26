package com.zorro.manage.common.framework;

public class JsonResult {
	private Integer success;
	private Object data;
	private String error;
	
	public JsonResult(Object data) {
		this.success = 1;
		this.data = data;
		this.error = "";
	}
	
	public JsonResult(Integer success, String error) {
		this.success = success;
		this.error = error;
	}
	
	public Integer getSuccess() {
		return success;
	}
	public void setSuccess(Integer success) {
		this.success = success;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
	
}

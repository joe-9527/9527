package com.zorro.manage.common.framework;

public class Token {
	private Long uid;
	private String token;
	
	public Token(long uid, String token) {
		this.uid = uid;
		this.token = token;
	}
	
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	
}

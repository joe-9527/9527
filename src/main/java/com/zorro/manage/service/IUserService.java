package com.zorro.manage.service;

import com.zorro.manage.model.User;

public interface IUserService {
	public boolean checkEmailIsExist(String email);
	
	public User getUserByEmail(String email);
	
	public User getUserById(long uid);
	
	public void registerNewUser(User user);
}

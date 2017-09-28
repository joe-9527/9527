package com.zorro.manage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zorro.manage.dao.UserMapper;
import com.zorro.manage.model.User;
import com.zorro.manage.service.IUserService;
@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	UserMapper userMapper;

	@Override
	public boolean checkEmailIsExist(String email) {
		User user = userMapper.selectByEmail(email);
		
		return user != null;
	}

	@Override
	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(long uid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long registerNewUser(User user) {
		int insertRow = userMapper.insert(user);
		if (insertRow == 0) {
			return null;
		}
		
		return user.getUid();
	}

	@Override
	public Long checkPassWord(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}

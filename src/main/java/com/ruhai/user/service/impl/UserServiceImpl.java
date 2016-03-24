package com.ruhai.user.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruhai.user.domain.model.User;
import com.ruhai.user.repository.UserMapper;
import com.ruhai.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User getUserByUserId(int user) {
		User userInfo = userMapper.getUserByUserId(user);
		return userInfo;
	}

	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(Map<String, Object> fields) {
		// TODO Auto-generated method stub
		
	}

}

package com.ruhai.user.service;

import java.util.Map;

import com.ruhai.user.domain.model.User;

public interface UserService {
	public User getUserByUserId(int user);
	public void insertUser(User user);
	public void updateUser(Map<String, Object> fields);
}

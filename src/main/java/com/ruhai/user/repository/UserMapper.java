package com.ruhai.user.repository;

import java.util.Map;

import com.ruhai.user.domain.model.User;

public interface UserMapper {
	public User getUserByUserId(int user);
	public void insertUser(User user);
	public void updateUser(Map<String, Object> fields);
}

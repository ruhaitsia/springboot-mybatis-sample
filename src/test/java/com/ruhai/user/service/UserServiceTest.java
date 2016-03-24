package com.ruhai.user.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ruhai.user.UserApplication;
import com.ruhai.user.domain.model.User;
import com.ruhai.user.repository.UserMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = UserApplication.class)
public class UserServiceTest {
	@Autowired
	private UserService userService;
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testGetUserByUserId(){
		User user = userService.getUserByUserId(100);
		Assert.assertEquals("cairuhai", user.getName());
	}
}

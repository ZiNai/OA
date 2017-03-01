package com.rimi.oa.service;

import java.util.Map;

import com.rimi.oa.entity.User;

public interface UserService {

	public void createUser(User user);

	public Map<String, Object> login(User user);

	public User changeUser(User user);

	public User findUser(Integer id);

}

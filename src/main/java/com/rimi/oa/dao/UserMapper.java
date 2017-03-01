package com.rimi.oa.dao;

import com.rimi.oa.entity.User;

public interface UserMapper {
	
	public void createUser(User user);

	public User selectUser(User user);
	
	public User changeUser(User user);
	
	public void deleteUser(User user);
}

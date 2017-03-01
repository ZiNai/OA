package com.rimi.oa.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.rimi.oa.dao.UserMapper;
import com.rimi.oa.entity.User;
import com.rimi.oa.service.UserService;
import com.rimi.oa.util.MyBatisUtil;

public class UserServiceImpl implements UserService{
	
	private SqlSession sqlSession = MyBatisUtil.getSqlSession();
	private UserMapper userMapper =sqlSession.getMapper(UserMapper.class);
	public void createUser(User user) {
		
	}

	public Map<String, Object> login(User user) {
		Map<String, Object> reuslt = new HashMap<String, Object>();
		
		try {
			User resultUser = userMapper.selectUser(user);
			reuslt.put("user", resultUser);
			if(resultUser == null){
				
				
				reuslt.put("error", "用戶名密碼錯誤");
			}
		} catch (Exception e) {
			reuslt.put("error", "用户不存在");
		}

		return reuslt;
	}

	public User changeUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public User findUser(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}

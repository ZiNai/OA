package com.rimi.oa.util;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class MyBatisUtil {
	private static SqlSessionFactory sqlSessionFactory;
	
	public SqlSessionFactory getSqlSessionFactory(){
		if(sqlSessionFactory == null){
			try {
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis.xml"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sqlSessionFactory;
	}
	
	public static SqlSession getSqlSession(){
		SqlSession sqlSession = new MyBatisUtil().getSqlSessionFactory().openSession();
		return sqlSession;	
	}
}

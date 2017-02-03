package com.company.login;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.company.member.Member;

@Repository
public class LoginDAOService implements LoginDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	public void login(Member member)
	{
		LoginMapper loginMapper = sqlSession.getMapper(LoginMapper.class);
		loginMapper.loginSQL(member);
	}
}

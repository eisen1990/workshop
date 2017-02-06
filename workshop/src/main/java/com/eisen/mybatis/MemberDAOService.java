package com.eisen.mybatis;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOService implements MemberDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	public ArrayList<Member> getMembers()
	{
		ArrayList<Member> result = new ArrayList<Member>();
		MemberMapper Mapper = sqlSession.getMapper(MemberMapper.class);
		result = Mapper.getMembersSQL();
		return result;
	}
}

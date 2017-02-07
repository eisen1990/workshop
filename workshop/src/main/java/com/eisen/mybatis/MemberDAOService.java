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
	
	public void insertMember(Member member)
	{
		MemberMapper Mapper = sqlSession.getMapper(MemberMapper.class);
		Mapper.insertMemberSQL(member);
	}
	
	public boolean login(Member member)
	{
		MemberMapper Mapper = sqlSession.getMapper(MemberMapper.class);
		if(Mapper.loginSQL(member).isEmpty()) {
			return false;
		}
		else {
			return true;
		}
	}
}

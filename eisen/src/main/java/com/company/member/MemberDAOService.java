package com.company.member;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOService implements MemberDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	public ArrayList<Member> getMember()
	{
		ArrayList<Member> result= new ArrayList<Member>();
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		result = memberMapper.getMemberSQL();
		return result;
	}
	
	public void insertMember(Member member)
	{
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		memberMapper.insertMemberSQL(member);
	}
}

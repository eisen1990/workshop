package com.eisen.mybatis;

import java.util.ArrayList;

public interface MemberMapper {
	public ArrayList<Member> getMembersSQL();
	public ArrayList<Member> loginSQL(Member member);
}

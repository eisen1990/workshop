package com.company.member;

import java.util.ArrayList;

public interface MemberMapper {
	public ArrayList<Member> getMemberSQL();
	public void insertMemberSQL(Member member);
}

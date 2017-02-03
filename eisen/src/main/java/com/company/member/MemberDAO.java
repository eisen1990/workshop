package com.company.member;

import java.util.ArrayList;

public interface MemberDAO {
	public ArrayList<Member> getMember();
	public void insertMember(Member member);
}

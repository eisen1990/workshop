package com.eisen.mybatis;

import java.util.ArrayList;

public interface MemberDAO {
	public ArrayList<Member> getMembers();
	public void insertMember(Member member);
	public boolean login(Member member);
}

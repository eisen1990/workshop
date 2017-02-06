package com.eisen.mybatis;

import java.util.ArrayList;

public interface MemberDAO {
	public ArrayList<Member> getMembers();
	public boolean login(Member member);
}

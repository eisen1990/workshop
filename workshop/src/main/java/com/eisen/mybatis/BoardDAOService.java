package com.eisen.mybatis;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOService implements BoardDAO{

	@Autowired
	private SqlSession sqlSession;
	
	public ArrayList<Board> showList()
	{
		ArrayList<Board> result = new ArrayList<Board>();
		BoardMapper Mapper = sqlSession.getMapper(BoardMapper.class);
		result = Mapper.showListSQL();
		return result;
	}
}

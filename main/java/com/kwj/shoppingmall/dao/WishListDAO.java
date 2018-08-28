package com.kwj.shoppingmall.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.kwj.shoppingmall.vo.UserVO;

public class WishListDAO extends SqlSessionDaoSupport{
private SqlSessionTemplate sqlSessionTemplate;
	
	public void insert(UserVO userVO) {
		getSqlSession().insert("WishList.insert" , userVO);
	}
	
	public List<UserVO> SelectList(){
		Map<String, String> paramMap = new HashMap<String, String>();
		return getSqlSession().selectList("WishList.selectList" , paramMap);
	}
}

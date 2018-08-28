package com.kwj.shoppingmall.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.kwj.shoppingmall.vo.BrandVO;

public class BrandDAO extends SqlSessionDaoSupport{
private SqlSessionTemplate sqlSessionTemplate;
	
	public void insert(BrandVO brandVO) {
		getSqlSession().insert("Brand.insert" , brandVO);
	}
	
	public List<BrandVO> SelectList(){
		Map<String, String> paramMap = new HashMap<String, String>();
		return getSqlSession().selectList("Brand.selectList" , paramMap);
	}
}

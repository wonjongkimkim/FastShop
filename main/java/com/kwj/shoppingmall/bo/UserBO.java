package com.kwj.shoppingmall.bo;

import org.springframework.beans.factory.annotation.Autowired;

import com.kwj.shoppingmall.dao.UserDAO;
import com.kwj.shoppingmall.dao.WishListDAO;
import com.kwj.shoppingmall.vo.ReviewVO;
import com.kwj.shoppingmall.vo.UserVO;
import com.kwj.shoppingmall.vo.WishListVO;

public class UserBO {
	@Autowired
	protected UserDAO userDAO;
	

	
	
	public void delete(UserVO userVO, ReviewVO reviewVO, WishListVO wishListVO) {
	//	if(reviewVO.getUserId().equals(userVO.getId()))
	//		reviewDAO.delete(reviewVO.getId());
		userDAO.delete(userVO.getId());
	}
	
	
}

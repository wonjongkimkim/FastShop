package com.kwj.shoppingmall;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kwj.shoppingmall.dao.UserDAO;
import com.kwj.shoppingmall.vo.UserVO;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context-test.xml"})

public class UserDAOTest {
	@Autowired
	protected UserDAO userDAO;
	
	@Test
	public void insert() {
		UserVO userVO = new UserVO();
		userVO.setId("2012003352");
		userVO.setUsername("wonjong");
		userVO.setEmail("dnjswhd@daum.net");
		userVO.setAddress("SEOUL");
		userVO.setPasswd("1234");
		userVO.setPhone("010-2017-8416");
		userVO.setCountry("korea");
		userVO.setDate("20180828");
		userDAO.insert(userVO);
	}
}

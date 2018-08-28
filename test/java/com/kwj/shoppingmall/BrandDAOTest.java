package com.kwj.shoppingmall;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.kwj.shoppingmall.dao.BrandDAO;
import com.kwj.shoppingmall.vo.BrandVO;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context-test.xml"})


public class BrandDAOTest {
	@Autowired
	protected BrandDAO brandDAO;
	
	@Test
	public void insert() {
		BrandVO brandVO = new BrandVO();
		brandVO.setName("Samsung");
		brandVO.setDescription("No1");
		brandVO.setImage(null);
		brandDAO.insert(brandVO);
	}
}

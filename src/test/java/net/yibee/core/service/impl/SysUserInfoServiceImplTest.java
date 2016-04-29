package net.yibee.core.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;

//@RunWith(SpringJUnit4ClassRunner.class)
//指定测试用例的运行器 这里是指定了Junit4
//@ContextConfiguration({"/abframe-context.xml","/abframe-context-security.xml","/oc-context.xml","/abframe-servlet.xml"})
////指定Spring的配置文
/*@ContextConfiguration({ "/spring.xml" })
@TransactionConfiguration(transactionManager = "txManager") 
@Transactional*/
//@ContextConfiguration("classpath:/spring.xml")
public class SysUserInfoServiceImplTest  extends BaseSpringTest{
	
	@Test
	public void testInsert() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAll() {
		Integer pageIndex = 1 ;
		Integer pageSize = 3 ; 
		List<Object> listAll = this.sysUserInfoService.findAll(pageIndex, pageSize);
		//this.printObj(listAll) ;
		//fail("Not yet implemented");
	}

	@Test
	public void testFindById() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByCount() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAllByConditions() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSysUserById() {
		fail("Not yet implemented");
	}

}

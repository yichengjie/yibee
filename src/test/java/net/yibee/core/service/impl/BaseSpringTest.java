package net.yibee.core.service.impl;

import javax.annotation.Resource;

import net.yibee.core.service.UserService;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.gson.Gson;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring.xml")
public abstract class BaseSpringTest {
	@Resource(name="sysUserInfoService")
	protected SysUserInfoServiceImpl  sysUserInfoService ;
	@Resource(name="userService")
	protected UserService userService ;
	protected Gson gson = new Gson() ;
	
	protected void printObj(Object obj){
		String json = gson.toJson(obj);
		System.out.println(json);
	}

}

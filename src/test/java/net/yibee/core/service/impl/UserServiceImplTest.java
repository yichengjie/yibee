package net.yibee.core.service.impl;
import net.yibee.core.entity.vo.SysUserVo;

import org.junit.Test;
public class UserServiceImplTest extends BaseSpringTest {
	
	@Test
	public void testSysAdminLogin() {
		try {
			SysUserVo user = new SysUserVo() ;
			SysUserVo existUser = userService.sysAdminLogin(user);	
			printObj(existUser) ;
		} catch (Exception e) {
			e.printStackTrace() ;
		}
		
	}

}

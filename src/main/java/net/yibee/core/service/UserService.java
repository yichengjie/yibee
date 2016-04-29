package net.yibee.core.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.yibee.core.entity.bo.SysUserBo;
import net.yibee.core.entity.vo.SysUserVo;


public interface UserService {
	
	/**
	 * 系统管理员登录
	 * @user coding云
	 * 2014年6月24日
	 */
	public SysUserVo sysAdminLogin(SysUserVo user) throws Exception;
	
}

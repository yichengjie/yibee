package net.yibee.core.service;

import net.yibee.core.entity.ValidCode;


public interface ValidCodeService {
	
	public void recordValidCode(String random, String type, String code);
	
	/**
	 * 检查验证输入是否正确
	 * <p>
	 * 请求验证码，参考：/valid/image?type=TYPE&random=RANDOM
	 * 
	 * @param random 随机值，与请求验证码的时候一致
	 * @param type 验证码类型，与请验证码的时候一致
	 * @param input 当前用户的输入
	 * @return
	 */
	public boolean checkValidCode(String randomString, String type, String authCode);
	
	public void remove(ValidCode code);

}

package com.d2c.msg.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.d2c.msg.model.LoginLog;
import com.d2c.mybatis.service.ListServiceImpl;

@Service("loginLogService")
@Transactional(readOnly = true, rollbackFor = Exception.class, propagation = Propagation.SUPPORTS)
public class LoginLogServiceImpl extends ListServiceImpl<LoginLog> implements LoginLogService {

	@Override
	public LoginLog insert(LoginLog entity) {
		return this.save(entity);
	}

}

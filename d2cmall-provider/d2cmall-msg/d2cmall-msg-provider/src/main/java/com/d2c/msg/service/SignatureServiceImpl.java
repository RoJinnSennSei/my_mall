package com.d2c.msg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.d2c.msg.dao.SignatureMapper;
import com.d2c.msg.model.Signature;
import com.d2c.mybatis.service.ListServiceImpl;

@Service(value = "signatureService")
@Transactional(readOnly = true, rollbackFor = Exception.class, propagation = Propagation.SUPPORTS)
public class SignatureServiceImpl extends ListServiceImpl<Signature> implements SignatureService {

	@Autowired
	private SignatureMapper signatureMapper;

	@Cacheable(value = "signature", key = "'signature_'+#appid", unless = "#result == null")
	public Signature findByAppid(String appid) {
		return signatureMapper.findByAppid(appid);
	}

	@CacheEvict(value = "signature", key = "'signature_'+#signature.appid")
	@Transactional(readOnly = false, rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
	public int update(Signature signature) {
		return this.updateNotNull(signature);
	}

}

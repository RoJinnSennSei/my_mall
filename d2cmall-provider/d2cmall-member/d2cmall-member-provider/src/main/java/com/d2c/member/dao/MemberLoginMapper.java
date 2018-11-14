package com.d2c.member.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.d2c.member.model.MemberLogin;
import com.d2c.mybatis.mapper.SuperMapper;

public interface MemberLoginMapper extends SuperMapper<MemberLogin> {

	String findOld(@Param("loginCode") String loginCode, @Param("device") String device);

	int deleteOld(@Param("loginCode") String loginCode, @Param("device") String device);

	String findByToken(@Param("token") String token);

	int deleteByToken(@Param("token") String token);

	List<String> findTokenByLoginCode(@Param("loginCode") String loginCode);

}
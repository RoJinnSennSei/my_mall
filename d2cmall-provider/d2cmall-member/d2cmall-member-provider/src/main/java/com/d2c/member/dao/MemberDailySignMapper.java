package com.d2c.member.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.d2c.common.api.page.PageModel;
import com.d2c.member.model.MemberDailySign;
import com.d2c.member.query.MemberDailySignSearcher;
import com.d2c.mybatis.mapper.SuperMapper;

public interface MemberDailySignMapper extends SuperMapper<MemberDailySign> {

	int countBySearcher(@Param("searcher") MemberDailySignSearcher searcher);

	List<MemberDailySign> findBySearcher(@Param("searcher") MemberDailySignSearcher searcher,
			@Param("page") PageModel page);

	MemberDailySign findLastByMember(@Param("memberId") Long memberId);

}

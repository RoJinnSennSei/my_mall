package com.d2c.member.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.d2c.common.api.page.PageModel;
import com.d2c.member.model.PartnerCounselor;
import com.d2c.member.query.PartnerCounselorSearcher;
import com.d2c.mybatis.mapper.SuperMapper;

public interface PartnerCounselorMapper extends SuperMapper<PartnerCounselor> {

	List<PartnerCounselor> findBySearcher(@Param("searcher") PartnerCounselorSearcher searcher,
			@Param("pager") PageModel pager);

	int countBySearcher(@Param("searcher") PartnerCounselorSearcher searcher);

	int doMark(@Param("id") Long id, @Param("mark") Integer mark);

}

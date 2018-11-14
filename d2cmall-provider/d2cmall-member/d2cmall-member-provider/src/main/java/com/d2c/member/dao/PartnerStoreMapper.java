package com.d2c.member.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.d2c.common.api.page.PageModel;
import com.d2c.member.model.PartnerStore;
import com.d2c.member.query.PartnerStoreSearcher;
import com.d2c.mybatis.mapper.SuperMapper;

public interface PartnerStoreMapper extends SuperMapper<PartnerStore> {

	PartnerStore findByMemberId(@Param("memberId") Long memberId);

	PartnerStore findByPartnerId(@Param("partnerId") Long partnerId);

	List<PartnerStore> findBySearcher(@Param("searcher") PartnerStoreSearcher searcher,
			@Param("pager") PageModel pager);

	int countBySearcher(@Param("searcher") PartnerStoreSearcher searcher);

}

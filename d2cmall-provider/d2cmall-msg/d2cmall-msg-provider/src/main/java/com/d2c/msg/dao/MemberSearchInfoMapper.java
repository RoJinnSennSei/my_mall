package com.d2c.msg.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.d2c.common.api.dto.CountDTO;
import com.d2c.common.api.page.PageModel;
import com.d2c.msg.model.MemberSearchInfo;
import com.d2c.msg.query.MemberSearchInfoSearcher;
import com.d2c.mybatis.mapper.SuperMapper;

public interface MemberSearchInfoMapper extends SuperMapper<MemberSearchInfo> {

	List<MemberSearchInfo> findBySearcher(@Param("searcher") MemberSearchInfoSearcher searcher,
			@Param("pager") PageModel pager);

	int countBySearcher(@Param("searcher") MemberSearchInfoSearcher searcher);

	List<CountDTO<String>> findGroupBySearcher(@Param("searcher") MemberSearchInfoSearcher searcher,
			@Param("pager") PageModel pager);

	int countGroupBySearcher(@Param("searcher") MemberSearchInfoSearcher searcher);

	int delete(Long id);

	int updateStatistic(@Param("keyword") String key, @Param("createDate") Date date,
			@Param("statistic") int statistic);

	void remove(@Param("keyword") String key, @Param("createDate") Date date, @Param("statistic") int statistic);

}

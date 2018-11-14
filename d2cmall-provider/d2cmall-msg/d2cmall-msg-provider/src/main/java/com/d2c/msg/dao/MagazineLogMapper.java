package com.d2c.msg.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.d2c.common.api.page.PageModel;
import com.d2c.msg.model.MagazineLog;
import com.d2c.mybatis.mapper.SuperMapper;

public interface MagazineLogMapper extends SuperMapper<MagazineLog> {

	int doInsert(MagazineLog magazineLog);

	List<MagazineLog> findByMemberId(@Param("memberId") Long memberId, @Param("pager") PageModel page);

	Integer countByMemberId(@Param("memberId") Long memberId);

}

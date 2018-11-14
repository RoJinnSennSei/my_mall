package com.d2c.order.dao;

import org.apache.ibatis.annotations.Param;

import com.d2c.mybatis.mapper.SuperMapper;
import com.d2c.order.model.ShareRedPacketsGroup;

public interface ShareRedPacketsGroupMapper extends SuperMapper<ShareRedPacketsGroup> {

	int updateNumber(@Param("id") Long id, @Param("number") Integer number);

	int updateStatus(@Param("id") Long id, @Param("status") Integer status);

	ShareRedPacketsGroup findByInitiatorMemberId(@Param("memberId") Long memberId,
			@Param("sharePromotionId") Long promotionId);

}

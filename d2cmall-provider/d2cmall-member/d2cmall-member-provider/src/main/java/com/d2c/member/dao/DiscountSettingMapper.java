package com.d2c.member.dao;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.d2c.common.api.page.PageModel;
import com.d2c.member.model.DiscountSetting;
import com.d2c.member.query.DiscountSettingSearcher;
import com.d2c.mybatis.mapper.SuperMapper;

public interface DiscountSettingMapper extends SuperMapper<DiscountSetting> {

	List<DiscountSetting> findBySearch(@Param("searcher") DiscountSettingSearcher searcher,
			@Param("pager") PageModel pager);

	int countBySearch(@Param("searcher") DiscountSettingSearcher searcher);

	List<DiscountSetting> findByDistributorId(Long id);

	List<DiscountSetting> findByGroupId(Long id);

	List<DiscountSetting> findByGroupOrDisId(@Param("groupId") Long groupId, @Param("distributorId") Long distributorId,
			@Param("disType") String disType, @Param("targetIds") List<Long> targetIds);

	int updateStatusById(@Param("id") Long id, @Param("status") int status);

	int updateDiscountById(@Param("id") Long id, @Param("discount") BigDecimal discount);

	DiscountSetting findByGroupIdAndProductId(@Param("groupId") Long groupId, @Param("productId") Long productId);

}

package com.d2c.analyze.api.services;

import com.d2c.analyze.api.mongo.model.PartnerSaleDO;
import com.d2c.analyze.api.query.base.BasePartnerQuery;
import com.d2c.common.api.page.PageModel;
import com.d2c.common.api.page.PageResult;

/**
 * 买手销售数据
 * @author wull
 */
public interface PartnerSaleService {

	/**
	 * 搜索经销商列表
	 */
	public PageResult<PartnerSaleDO> findPageQuery(BasePartnerQuery mongoQuery, PageModel pager);
	
	public PageResult<PartnerSaleDO> findPageBack(BasePartnerQuery mongoQuery, PageModel pager);
	
	/**
	 * 搜索经销商数据
	 */
	public PartnerSaleDO findPartnerSaleById(Long partnerId);

	/**
	 * 创建买手统计数据
	 * <p>定时任务-每天
	 */
	public Integer buildReport();

}
 
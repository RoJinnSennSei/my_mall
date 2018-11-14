package com.d2c.backend.rest.analyze;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.d2c.analyze.api.mongo.model.PartnerSaleDO;
import com.d2c.analyze.api.query.PartnerBackQuery;
import com.d2c.analyze.api.services.PartnerSaleService;
import com.d2c.analyze.api.services.PartnerSaleTimeService;
import com.d2c.backend.rest.base.SuperCtrl;
import com.d2c.common.api.page.PageModel;
import com.d2c.common.api.page.PageResult;
import com.d2c.common.api.response.Response;
import com.d2c.common.api.response.ResultHandler;

@RestController
@RequestMapping("/rest/analyze/partner")
public class PartnerAnalyzeCtrl extends SuperCtrl {

	@Reference
	private PartnerSaleService partnerSaleService;
	@Reference
	private PartnerSaleTimeService partnerSaleTimeService;
	
	/**
	 * 经销商数据列表
	 * <p>API: /rest/analyze/partner/list
	 */
	@ResponseBody
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public Response list(PartnerBackQuery query, PageModel pager) {
		PageResult<?> result = null;
		if(query.getType() != null && query.getType().equals("day")){
			if(pager.getSort() == null) pager.setSort("day");
			result = partnerSaleTimeService.findPageDayBack(query, pager);
		}else if (query.getType() != null && query.getType().equals("month")){
			if(pager.getSort() == null) pager.setSort("month");
			result = partnerSaleTimeService.findPageMonthBack(query, pager);
		}else{
			if(pager.getSort() == null) pager.setSort("partnerId");
			result = partnerSaleService.findPageBack(query, pager);
		}
		return ResultHandler.success(result);
	}

	/**
	 * 经销商数据
	 * <p>API: /rest/analyze/partner/{id}
	 */
	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Response findPartnerSale(@PathVariable Long id) {
		PartnerSaleDO bean = partnerSaleService.findPartnerSaleById(id);
		return ResultHandler.success(bean);
	}
	
}

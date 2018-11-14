package com.d2c.analyze.api.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.d2c.analyze.api.model.ProductOrderAnalysis;
import com.d2c.analyze.api.query.ProductOrderAnalysisSearcher;
import com.d2c.common.api.page.PageModel;
import com.d2c.common.api.page.PageResult;

public interface ProductOrderAnalysisService {

	PageResult<ProductOrderAnalysis> findBySearcher(ProductOrderAnalysisSearcher searcher, PageModel page);

	Integer countBySearcher(ProductOrderAnalysisSearcher searcher);

	ProductOrderAnalysis insert(ProductOrderAnalysis productOrderAnalysis);

	void doReplaceInto(ProductOrderAnalysis productOrderAnalysis);

	List<Map<String, Object>> findExport(ProductOrderAnalysisSearcher searcher, PageModel page);

	Integer countExport(ProductOrderAnalysisSearcher searcher);

	ProductOrderAnalysis findLast();

	int updatepDeliverAndClose(Long designerId, String productSku, Integer deliverQuantity, Integer closeQuantity,
			Date orderDate);

}

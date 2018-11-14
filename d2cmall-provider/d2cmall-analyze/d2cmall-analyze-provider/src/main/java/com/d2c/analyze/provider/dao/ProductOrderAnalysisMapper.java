package com.d2c.analyze.provider.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.d2c.analyze.api.model.ProductOrderAnalysis;
import com.d2c.analyze.api.query.ProductOrderAnalysisSearcher;
import com.d2c.common.api.page.PageModel;
import com.d2c.mybatis.mapper.SuperMapper;

public interface ProductOrderAnalysisMapper extends SuperMapper<ProductOrderAnalysis> {

	void doReplaceInto(ProductOrderAnalysis item);

	List<ProductOrderAnalysis> findBySearcher(@Param("searcher") ProductOrderAnalysisSearcher searcher,
			@Param("pager") PageModel page);

	Integer countBySearcher(@Param("searcher") ProductOrderAnalysisSearcher searcher);

	ProductOrderAnalysis findLast();

	List<Map<String, Object>> findExport(@Param("searcher") ProductOrderAnalysisSearcher searcher,
			@Param("pager") PageModel page);

	Integer countExport(@Param("searcher") ProductOrderAnalysisSearcher searcher);

	Integer countSaleQuantity(@Param("searcher") ProductOrderAnalysisSearcher searcher);

	int updatepDeliverAndClose(@Param("designerId") Long designerId, @Param("productSku") String productSku,
			@Param("deliverQuantity") Integer deliverQuantity, @Param("closeQuantity") Integer closeQuantity,
			@Param("orderDate") Date orderDate);
}
package com.d2c.product.service;

import java.util.List;

import com.d2c.common.api.page.PageModel;
import com.d2c.product.model.CrawUrl;

public interface CrawUrlService {

	int countByStatus(int status);

	List<CrawUrl> findListByStatus(int status, PageModel pageModel);

	CrawUrl insert(CrawUrl crawUrl);

	int updateStatusByUrl(String crawUrl);

	CrawUrl findByRootUrlAndPageNo(String rootUrl, String pageNo);

	CrawUrl findById(Long id);

	CrawUrl findByProductId(String productId);

	void doClearUrlByDesignerId(Long designerId);

}

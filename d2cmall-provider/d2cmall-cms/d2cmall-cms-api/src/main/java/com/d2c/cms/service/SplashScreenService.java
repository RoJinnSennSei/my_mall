package com.d2c.cms.service;

import com.d2c.cms.model.SplashScreen;
import com.d2c.cms.query.SplashScreenSearcher;
import com.d2c.common.api.page.PageModel;
import com.d2c.common.api.page.PageResult;

public interface SplashScreenService {
	SplashScreen insert(SplashScreen splashScreen);

	PageResult<SplashScreen> findBySearcher(PageModel page, SplashScreenSearcher searcher);

	SplashScreen findCurrentVersion();

	int update(SplashScreen splashScreen);

	int updateStatus(Long id, Integer status, String lastModifyMan);

	SplashScreen findById(Long id);

	int doTiming(Long id, Integer timing);
}

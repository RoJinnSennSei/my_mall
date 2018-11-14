package com.d2c.cms.service;

import java.util.List;

import com.d2c.cms.model.AdResource;
import com.d2c.cms.query.AdResourceSearcher;
import com.d2c.common.api.page.PageModel;
import com.d2c.common.api.page.PageResult;

public interface AdResourceService {

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	AdResource findById(Long id);

	/**
	 * 根据appChannel查询
	 * 
	 * @param appChannel
	 * @return
	 */
	List<AdResource> findByAppChannel(String appChannel);

	/**
	 * 根据appChannel和type查询
	 * 
	 * @param appChannel
	 * @param type
	 * @return
	 */
	AdResource findByAppChannelAndType(String appChannel, String type);

	/**
	 * 根据searcher查询
	 * 
	 * @param searcher
	 * @param page
	 * @return
	 */
	PageResult<AdResource> findBySearcher(AdResourceSearcher searcher, PageModel page);

	/**
	 * 新增
	 * 
	 * @param adResource
	 * @return
	 */
	AdResource insert(AdResource adResource);

	/**
	 * 更新
	 * 
	 * @param adResource
	 * @return
	 */
	int update(AdResource adResource);

	/**
	 * 更新状态
	 * 
	 * @param id
	 * @param status
	 * @return
	 */
	int updateStatus(Long id, Integer status);

	/**
	 * 删除
	 * 
	 * @param id
	 * @return
	 */
	int delete(Long id);

}

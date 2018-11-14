package com.d2c.cms.service;

import com.d2c.cms.dto.VoteDefDto;
import com.d2c.cms.model.VoteDef;
import com.d2c.cms.query.VoteDefSearcher;
import com.d2c.common.api.page.PageModel;
import com.d2c.common.api.page.PageResult;

public interface VoteDefService {

	/**
	 * 新增投票定义
	 * 
	 * @param voteDef
	 * @return
	 */
	VoteDef insert(VoteDef voteDef);

	/**
	 * 查询投票定义列表
	 * 
	 * @param searcher
	 * @param page
	 * @return
	 */
	PageResult<VoteDef> findBySearch(VoteDefSearcher searcher, PageModel page);

	/**
	 * 修改投票定义状态
	 * 
	 * @param id
	 * @param status
	 * @return
	 */
	int updateStatus(Long id, Integer status);

	/**
	 * 通过ID查询
	 * 
	 * @param id
	 * @return
	 */
	VoteDefDto findDtoById(Long id);

	/**
	 * 修改投票定义
	 * 
	 * @param voteDef
	 * @return
	 */
	int update(VoteDef voteDef);

	VoteDef findById(Long id);
}

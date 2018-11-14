package com.d2c.msg.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.d2c.common.api.page.PageModel;
import com.d2c.msg.model.CompensationLog;
import com.d2c.mybatis.mapper.SuperMapper;

public interface CompensationLogMapper extends SuperMapper<CompensationLog> {

	/**
	 * 查询设计师端操作日志
	 * 
	 * @param id
	 * @param page
	 * @return
	 */
	List<CompensationLog> findCompensation(@Param("id") Long id, @Param("page") PageModel page);

	/**
	 * 统计设计师端操作日志
	 * 
	 * @param id
	 * @return
	 */
	int countCompensation(@Param("id") Long id);

	/**
	 * 分页查询客户端赔偿操作日志
	 * 
	 * @param id
	 * @param page
	 * @return
	 */
	List<CompensationLog> findCusCompensation(@Param("id") Long id, @Param("page") PageModel page);

	/**
	 * 统计客户端赔偿操作日志
	 * 
	 * @param id
	 * @return
	 */
	int countCusCompensation(@Param("id") Long id);

}

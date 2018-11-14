package com.d2c.msg.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.d2c.common.api.page.PageModel;
import com.d2c.msg.model.ExportLog;
import com.d2c.mybatis.mapper.SuperMapper;

public interface ExportLogMapper extends SuperMapper<ExportLog> {

	List<ExportLog> findByCreatorAndType(@Param("creator") String creator, @Param("log_type") String log_type);

	int countNum(@Param("creator") String creator, @Param("log_type") String[] log_type);

	List<ExportLog> findForPage(@Param("creator") String creator, @Param("log_type") String[] log_type,
			@Param("pager") PageModel page);

	int deleteById(@Param("id") Long id, @Param("creator") String creator);

}

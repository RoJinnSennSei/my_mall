package com.d2c.product.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.d2c.common.api.page.PageModel;
import com.d2c.mybatis.mapper.SuperMapper;
import com.d2c.product.model.ProductComb;
import com.d2c.product.query.ProductCombSearcher;

public interface ProductCombMapper extends SuperMapper<ProductComb> {

	List<ProductComb> findBySearcher(@Param("searcher") ProductCombSearcher searcher, @Param("pager") PageModel pager);

	int countBySearcher(@Param("searcher") ProductCombSearcher searcher);

	int updateMark(@Param("id") Long id, @Param("mark") int mark);

}

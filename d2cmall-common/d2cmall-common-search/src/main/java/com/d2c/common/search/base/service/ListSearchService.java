package com.d2c.common.search.base.service;

import java.io.Serializable;

import com.d2c.common.api.page.PageResult;
import com.d2c.common.api.page.Pager;
import com.d2c.common.api.query.model.EsQuery;
import com.d2c.common.search.model.ParentSearchDO;

public interface ListSearchService<T extends ParentSearchDO<ID>, ID extends Serializable> extends BaseSearchService<T, ID> {

    public PageResult<T> findByPage(EsQuery query);
	
    public PageResult<T> findByPage(EsQuery query, Pager page);
    
    
}

package com.d2c.product.query;

import com.d2c.common.api.query.model.BaseQuery;

public class ProductCategorySearcher extends BaseQuery {

	private static final long serialVersionUID = 1L;

	private Long topId;

	private Long parentId;

	private Integer depth;

	private Integer status;

	private Long path;

	private Integer leaf;

	public Long getTopId() {
		if (topId != null && topId.intValue() == 0) {
			return null;
		}
		return topId;
	}

	public void setTopId(Long topId) {
		this.topId = topId;
	}

	public Long getParentId() {
		if (parentId != null && parentId.intValue() == 0) {
			return null;
		}
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Integer getDepth() {
		return depth;
	}

	public void setDepth(Integer depth) {
		this.depth = depth;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getPath() {
		return path;
	}

	public void setPath(Long path) {
		this.path = path;
	}

	public Integer getLeaf() {
		return leaf;
	}

	public void setLeaf(Integer leaf) {
		this.leaf = leaf;
	}

}

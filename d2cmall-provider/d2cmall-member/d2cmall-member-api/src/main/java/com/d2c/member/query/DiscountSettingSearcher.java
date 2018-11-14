package com.d2c.member.query;

import java.math.BigDecimal;

import com.d2c.common.api.query.model.BaseQuery;
import com.d2c.util.string.StringUtil;

public class DiscountSettingSearcher extends BaseQuery {

	private static final long serialVersionUID = 1L;

	/**
	 * 折扣组
	 */
	private Long groupId;
	/**
	 * 分销商
	 */
	private Long distributorId;
	/**
	 * 折扣类型
	 */
	private String disType;
	/**
	 * 是否上架
	 */
	private Boolean up;
	/**
	 * 产品编号
	 */
	private String productSn;
	/**
	 * 产品名称
	 */
	private String productName;
	/**
	 * 0停用，1启用
	 */
	private Integer status;
	/**
	 * 产品Id
	 */
	private Long productId;
	/**
	 * 产品Ids
	 */
	private Long[] productIds;
	/**
	 * 品牌Id
	 */
	private Long brandId;
	/**
	 * 最低价
	 */
	private BigDecimal minPrice;
	/**
	 * 最高价
	 */
	private BigDecimal maxPrice;
	/**
	 * 排序字段
	 */
	private String orderByStr = "d.create_date DESC";

	public Long getDistributorId() {
		return distributorId;
	}

	public void setDistributorId(Long distributorId) {
		this.distributorId = distributorId;
	}

	public Boolean getUp() {
		return up;
	}

	public void setUp(Boolean up) {
		this.up = up;
	}

	public String getProductSn() {
		return productSn;
	}

	public void setProductSn(String productSn) {
		this.productSn = productSn;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getDisType() {
		return disType;
	}

	public void setDisType(String disType) {
		this.disType = disType;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long[] getProductIds() {
		return productIds;
	}

	public void setProductIds(Long[] productIds) {
		this.productIds = productIds;
	}

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public BigDecimal getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(BigDecimal minPrice) {
		this.minPrice = minPrice;
	}

	public BigDecimal getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(BigDecimal maxPrice) {
		this.maxPrice = maxPrice;
	}

	public String getOrderByStr() {
		return orderByStr;
	}

	public void setOrderByStr(String orderByStr) {
		this.orderByStr = orderByStr;
	}

	public void initOrderStr() {
		if (StringUtil.isBlank(orderByStr)) {
			orderByStr = "d.create_date DESC";
		}
		if (orderByStr.equalsIgnoreCase("dd")) {
			orderByStr = "d.discount ASC";
		} else if (orderByStr.equalsIgnoreCase("da")) {
			orderByStr = "d.discount DESC";
		} else if (orderByStr.equalsIgnoreCase("pd")) {
			orderByStr = "p.original_price*d.discount DESC";
		} else if (orderByStr.equalsIgnoreCase("pa")) {
			orderByStr = "p.original_price*d.discount ASC";
		}
	}

}

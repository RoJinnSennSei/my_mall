package com.d2c.product.dto;

import java.util.List;

import com.d2c.product.model.BrandContract;
import com.d2c.product.model.BrandDetail;

public class BrandDetailDto extends BrandDetail {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<BrandContract> contracts;

	public List<BrandContract> getContracts() {
		return contracts;
	}

	public void setContracts(List<BrandContract> contracts) {
		this.contracts = contracts;
	}

}

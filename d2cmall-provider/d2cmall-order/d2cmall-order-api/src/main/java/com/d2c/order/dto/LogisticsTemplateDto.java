package com.d2c.order.dto;

import java.util.List;

import com.d2c.order.model.LogisticsPostage;
import com.d2c.order.model.LogisticsTemplate;

public class LogisticsTemplateDto extends LogisticsTemplate {

	private static final long serialVersionUID = 1L;

	/**
	 * 邮费设置
	 */
	private List<LogisticsPostage> logisticsPostage;

	public List<LogisticsPostage> getLogisticsPostage() {
		return logisticsPostage;
	}

	public void setLogisticsPostage(List<LogisticsPostage> logisticsPostage) {
		this.logisticsPostage = logisticsPostage;
	}

}

package com.d2c.order.model;

import java.util.Date;

import javax.persistence.Table;

import com.d2c.common.api.model.PreUserDO;

/**
 * 节假日
 *
 */
@Table(name = "sys_holiday")
public class Holiday extends PreUserDO {

	private static final long serialVersionUID = 1L;

	/**
	 * 日期
	 */
	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}

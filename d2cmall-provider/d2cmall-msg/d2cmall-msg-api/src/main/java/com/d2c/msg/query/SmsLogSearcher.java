package com.d2c.msg.query;

import com.d2c.common.api.query.model.BaseQuery;
import com.d2c.msg.model.SmsLog.SmsLogType;

public class SmsLogSearcher extends BaseQuery {

	private static final long serialVersionUID = 1L;

	/**
	 * 发送内容
	 */
	private String content;
	/**
	 * 业务
	 */
	private String source;
	/**
	 * 手机号
	 */
	private String mobile;
	/**
	 * 类型
	 */
	private SmsLogType type;
	/**
	 * 发送次数
	 */
	private int send = 0;
	/**
	 * 最大发送次数
	 */
	private int maxSend = 10;
	/**
	 * 短信验证码
	 */
	private String code;
	/**
	 * 最后一次IP
	 */
	private String ip;
	/**
	 * 最后一次终端
	 */
	private String terminal;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public SmsLogType getType() {
		return type;
	}

	public void setType(SmsLogType type) {
		this.type = type;
	}

	public int getSend() {
		return send;
	}

	public void setSend(int send) {
		this.send = send;
	}

	public int getMaxSend() {
		return maxSend;
	}

	public void setMaxSend(int maxSend) {
		this.maxSend = maxSend;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getTerminal() {
		return terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}

}

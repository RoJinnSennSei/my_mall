package com.d2c.member.search.support;

import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;

public class MemberShareHelp implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 会员ID
	 */
	private Long memberId;
	/**
	 * 头像
	 */
	private String headPic;
	/**
	 * 昵称
	 */
	private String nickName;
	/**
	 * 热度
	 */
	private Long hot;

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public String getHeadPic() {
		return headPic;
	}

	public void setHeadPic(String headPic) {
		this.headPic = headPic;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Long getHot() {
		return hot;
	}

	public void setHot(Long hot) {
		this.hot = hot;
	}

	public JSONObject toJson() {
		JSONObject json = new JSONObject();
		json.put("memberId", this.getMemberId());
		json.put("headPic", this.getHeadPic());
		json.put("nickName", this.getNickName());
		json.put("hot", this.getHot());
		return json;
	}
}

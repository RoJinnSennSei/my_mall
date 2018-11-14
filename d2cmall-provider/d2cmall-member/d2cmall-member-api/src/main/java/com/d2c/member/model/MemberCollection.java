package com.d2c.member.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Table;

import com.alibaba.fastjson.JSONObject;
import com.d2c.common.api.annotation.AssertColumn;
import com.d2c.common.api.model.PreUserDO;
import com.d2c.common.base.utils.StringUt;

/**
 * 收藏的商品
 *
 */
@Table(name = "m_member_collection")
public class MemberCollection extends PreUserDO {

	private static final long serialVersionUID = 1L;

	/**
	 * 会员ID
	 */
	@AssertColumn("会员ID不能为空")
	private Long memberId;
	/**
	 * 会员昵称
	 */
	private String nickName;
	/**
	 * 会员头像
	 */
	private String headPic;
	/**
	 * 商品ID
	 */
	private Long productId;
	/**
	 * 商品标题
	 */
	private String productName;
	/**
	 * 商品头图
	 */
	private String productPic;
	/**
	 * 商品货号 TODO 重构
	 */
	@Column(name = "product_inernalsn")
	private String productInernalSN;
	/**
	 * 设计师品牌名称
	 */
	private String designers;
	/**
	 * 收藏时的商品价格
	 */
	private BigDecimal productPrice;

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getHeadPic() {
		return headPic;
	}

	public void setHeadPic(String headPic) {
		this.headPic = headPic;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductPic() {
		return productPic;
	}

	public void setProductPic(String productPic) {
		this.productPic = productPic;
	}

	public String getProductPicFirst() {
		if (this.productPic != null) {
			return productPic.split(",")[0];
		}
		return "";
	}

	public String getProductInernalSN() {
		return productInernalSN;
	}

	public void setProductInernalSN(String productInernalSN) {
		this.productInernalSN = productInernalSN;
	}

	public String getDesigners() {
		return designers;
	}

	public void setDesigners(String designers) {
		this.designers = designers;
	}

	public BigDecimal getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}

	public JSONObject toJson() {
		JSONObject obj = new JSONObject();
		obj.put("memberId", this.getMemberId());
		obj.put("nickName", StringUt.hideMobile(this.getNickName()));
		obj.put("headPic", this.getHeadPic());
		obj.put("productId", this.getProductId());
		obj.put("productName", this.getProductName());
		obj.put("productPic", this.getProductPicFirst());
		obj.put("productPrice", this.getProductPrice());
		return obj;
	}

}

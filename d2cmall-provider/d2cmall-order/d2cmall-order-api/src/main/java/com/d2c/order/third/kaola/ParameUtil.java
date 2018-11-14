package com.d2c.order.third.kaola;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.d2c.order.third.kaola.model.OrderItem;
import com.d2c.order.third.kaola.model.UserInfo;

public class ParameUtil {

	public static String userInfo(UserInfo userInfo) {
		JSONObject obj = new JSONObject();
		obj.put("userInfo", userInfo);
		return obj.toJSONString();
	}

	public static String orderItemLists(List<OrderItem> orderItemLists) {
		JSONObject obj = new JSONObject();
		obj.put("orderItemList", orderItemLists);
		return obj.toJSONString();

	}
}

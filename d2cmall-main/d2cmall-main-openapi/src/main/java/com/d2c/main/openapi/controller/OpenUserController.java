package com.d2c.main.openapi.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.d2c.common.api.response.Response;
import com.d2c.common.api.response.ResultHandler;
import com.d2c.main.openapi.constant.OpenConst;
import com.d2c.main.openapi.controller.base.BaseController;
import com.d2c.main.openapi.security.OpenUserHolder;
import com.d2c.openapi.api.entity.OpenUserDO;

/**
 * 采购单开放接口
 * @author wull
 */
@RestController
@RequestMapping(value = OpenConst.OPEN_PREF + "/user")
public class OpenUserController extends BaseController {

	@ResponseBody
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public Response findTest() {
		return ResultHandler.success(OpenUserHolder.getOpenUser());
	}
	
	@ResponseBody
	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public Response findPost(@RequestBody OpenUserDO user) {
		return ResultHandler.success(user);
	}

}

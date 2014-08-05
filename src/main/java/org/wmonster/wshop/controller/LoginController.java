package org.wmonster.wshop.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(LoginController.BASE_URL)
public class LoginController {
	protected static final String BASE_URL = "/login";

	@RequestMapping(value = "/get/{name}", method = RequestMethod.POST)
	@ResponseBody
	public String getName(@PathVariable String name) {
		return "home";
	}

}

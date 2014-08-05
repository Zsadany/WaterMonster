package org.wmonster.wshop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.wmonster.wshop.model.Order;

@RestController
@RequestMapping(value = OrderController.ORDER_URL)
public class OrderController {

	protected static final String ORDER_URL = "/order";

	@RequestMapping(value = "", method = RequestMethod.POST)
	public void sendOrder(@RequestParam Order order) {

	}

}

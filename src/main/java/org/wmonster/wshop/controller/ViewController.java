package org.wmonster.wshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ViewController {

	/**
	 * Home view.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}

	/**
	 * Products view.
	 */
	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public String products() {
		return "products";
	}
	
}
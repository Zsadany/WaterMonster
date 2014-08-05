package org.wmonster.wshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.wmonster.wshop.model.product.search.ProductSearch;
import org.wmonster.wshop.model.product.search.ProductSearchResponse;
import org.wmonster.wshop.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/search", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductSearchResponse products(@RequestParam(required=false) Integer page) {
		if (page == null || page == 0)
			return productService.getAllProducts();
		ProductSearch productSearch;
		productSearch = ProductSearch
				.Build.newSearch()
				.selectSearchResultPage(page)
				.build();
		return productService.run(productSearch);
	}
}

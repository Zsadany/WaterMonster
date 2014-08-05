package org.wmonster.wshop.service;

import org.springframework.stereotype.Service;
import org.wmonster.wshop.model.product.search.ProductSearch;
import org.wmonster.wshop.model.product.search.ProductSearchResponse;

@Service
public interface ProductService {

	/**
	 * Gets all the products.
	 */
	ProductSearchResponse getAllProducts();

	/**
	 * Searches for products matching the search parameters.
	 * @param productSearch object containing the parameters of the search {@link ProductSearch}.
	 * @return List of products found.
	 */
	ProductSearchResponse run(ProductSearch productSearch);

}

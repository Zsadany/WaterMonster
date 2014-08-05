package org.wmonster.wshop.model.product.search;

import java.util.List;

import org.wmonster.wshop.model.product.Product;

public class ProductSearchResponse {
	private List<Product> productsOnPage;
	private int actualPage;
	private int numberOfPages;

	public ProductSearchResponse(List<Product> productsOnPage, int actualPage, int numberOfPages) {
		this.productsOnPage = productsOnPage;
		this.actualPage = actualPage;
		this.numberOfPages = numberOfPages;
	}

	public List<Product> getProductsOnPage() {
		return productsOnPage;
	}

	public int getActualPage() {
		return actualPage;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}
}

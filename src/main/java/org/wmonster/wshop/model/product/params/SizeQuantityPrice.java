package org.wmonster.wshop.model.product.params;

import java.math.BigDecimal;

public class SizeQuantityPrice {

	private ProductSize size;
	private int quantity;
	private BigDecimal price;

	public SizeQuantityPrice(ProductSize size, int quantity, BigDecimal price) {
		this.size = size;
		this.price = price;
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public ProductSize getSize() {
		return size;
	}
}

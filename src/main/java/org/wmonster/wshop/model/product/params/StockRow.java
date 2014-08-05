package org.wmonster.wshop.model.product.params;

import java.math.BigDecimal;

public class StockRow {

	private ProductSize size;
	private int quantity;
	private BigDecimal price;
	private Promo promo;

	public StockRow(ProductSize size, int quantity, BigDecimal price, Promo promo) {
		this.size = size;
		this.price = price;
		this.quantity = quantity;
		this.promo = promo;
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

	public Promo getPromo() {
		return promo;
	}
}

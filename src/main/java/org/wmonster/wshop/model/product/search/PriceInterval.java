package org.wmonster.wshop.model.product.search;

import java.math.BigDecimal;

public class PriceInterval {
	private BigDecimal bottomLimit;
	private BigDecimal upperLimit;

	public PriceInterval(BigDecimal bottomLimit, BigDecimal upperLimit) {
		this.bottomLimit = bottomLimit;
		this.upperLimit = upperLimit;
	}

	public BigDecimal getBottomLimit() {
		return bottomLimit;
	}

	public BigDecimal getUpperLimit() {
		return upperLimit;
	}
}

package org.wmonster.wshop.model.product.params.type;

public enum PromoType implements ProductType {
	HALF_PRICE("Feeel aron ember, hat ez kihagyhatatlaaaaan !");

	private ProductType parent;
	private String description;

	private PromoType(String description) {
		this.parent = MainType.PROMO;
		this.description = description;
	}

	@Override
	public ProductType getParent() {
		return parent;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return name() + "{ desc.: " + description + " }";
	}

}

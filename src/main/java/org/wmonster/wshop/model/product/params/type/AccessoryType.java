package org.wmonster.wshop.model.product.params.type;

public enum AccessoryType implements ProductType {
	SZEMCSI("szemuveg"),
	VIZIPISTULY("Vizi mordaly");

	private ProductType parent;
	private String description;

	private AccessoryType(String description) {
		this.parent = MainType.ACCESSORY;
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

package org.wmonster.wshop.model.product.params.type;

public enum MainType implements ProductType {
	MALE("Male Products"), 
	FEMALE("Female Products"), 
	ACCESSORY("Accessory Products"),
	TEXTIL("Textil Products"),
	PROMO("Promo Products");

	String description;

	MainType(String description) {
		this.description = description;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public ProductType getParent() {
		return this;
	}

	@Override
	public String toString() {
		return name() + "{ desc.: " + description + " }";
	}
}

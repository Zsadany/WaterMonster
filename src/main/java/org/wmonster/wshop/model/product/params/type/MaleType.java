package org.wmonster.wshop.model.product.params.type;

public enum MaleType implements ProductType {
	FUDRO_GATYA("Gatya"), 
	FURDO_SAPI("Sapi");

	private ProductType parent;
	private String description;

	private MaleType(String description) {
		this.parent = MainType.MALE;
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

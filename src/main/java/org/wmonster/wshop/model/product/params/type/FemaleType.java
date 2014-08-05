package org.wmonster.wshop.model.product.params.type;

public enum FemaleType implements ProductType {
	CICA_NACI("Naci"),
	FURDO_RUCI("Ruci");
	
	private ProductType parent;
	private String description;

	private FemaleType(String description) {
		this.parent = MainType.FEMALE;
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

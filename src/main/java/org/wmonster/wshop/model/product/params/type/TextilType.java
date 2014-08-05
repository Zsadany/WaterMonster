package org.wmonster.wshop.model.product.params.type;

public enum TextilType implements ProductType {
	POLO("treecko"),
	BEKATALP("breki");

	private ProductType parent;
	private String description;

	private TextilType(String description) {
		this.parent = MainType.TEXTIL;
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

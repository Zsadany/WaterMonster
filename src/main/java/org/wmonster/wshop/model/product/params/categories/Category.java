package org.wmonster.wshop.model.product.params.categories;

import java.util.HashSet;
import java.util.Set;

public enum Category implements ProductCategory {
	MALE, FEMALE, ACCESSORY, TEXTIL;
	@Override
	public final Set<ProductCategory> toCategories() {
		Set<ProductCategory> chain = new HashSet<ProductCategory>();
		chain.add(this);
		return chain;
	}

	public static enum Male implements ProductCategory {
		GATYA, KAJA, PIA;
		@Override
		public final Set<ProductCategory> toCategories() {
			return chainCategories(MALE, this);
		}
	}

	public static enum Female implements ProductCategory {
		NACI, RUCI, DRESS;
		@Override
		public final Set<ProductCategory> toCategories() {
			return chainCategories(FEMALE, this);
		}
	}

	public static enum Accessory implements ProductCategory {
		GLASSES, WATERGUN;
		@Override
		public final Set<ProductCategory> toCategories() {
			return chainCategories(ACCESSORY, this);
		}
	}

	public static enum Textil implements ProductCategory {
		POLO, FLAG, BEKATALP;
		@Override
		public final Set<ProductCategory> toCategories() {
			return chainCategories(TEXTIL, this);
		}
	}

	private static final Set<ProductCategory> chainCategories(ProductCategory parentCategory, ProductCategory category) {
		Set<ProductCategory> chain = parentCategory.toCategories();
		chain.add(category);
		return chain;
	}
}

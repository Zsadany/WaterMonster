package org.wmonster.wshop.model.product.search;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.wmonster.wshop.model.product.params.categories.ProductCategory;

public class ProductSearch {
	private UUID id;
	private String name;
	private Set<ProductCategory> categories;
	private PriceInterval priceInterval;
	private int page;

	private ProductSearch() {
	}

	public static final class Build {
		ProductSearch search;

		private Build() {
			search = new ProductSearch();
			search.categories = new HashSet<ProductCategory>();
		}

		public static ProductSearch newSearchById(UUID id) {
			Build builder = new Build();
			builder.search.id = id;
			return builder.search;
		}

		public static ProductSearch newSearchByName(String name) {
			Build builder = new Build();
			builder.search.name = name;
			return builder.search;
		}

		public static Build newSearch() {
			return new Build();
		}

		public Build searchInMatchingCategory(ProductCategory category) {
			search.categories.add(category);
			return this;
		}

		public Build searchInPriceInterval(PriceInterval priceInterval) {
			search.priceInterval = priceInterval;
			return this;
		}

		public Build selectSearchResultPage(int page) {
			search.page = page;
			return this;
		}

		public ProductSearch build() {
			return search;
		}
	}

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Set<ProductCategory> getCategories() {
		return categories;
	}

	public PriceInterval getPriceInterval() {
		return priceInterval;
	}

	public int getPage() {
		return page;
	}
}

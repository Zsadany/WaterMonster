package org.wmonster.wshop.model.product;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.wmonster.wshop.model.product.ImageView.View;
import org.wmonster.wshop.model.product.params.StockRow;
import org.wmonster.wshop.model.product.params.categories.ProductCategory;

/**
 * Product of the WM web-shop that can be ordered and viewed on the UI.
 * 
 * @author Zsadany_Fulop
 */
@Document(collection = "products")
public class Product {

	@Id
	private UUID id;
	private String name;
	private Set<ProductCategory> categories;
	private List<StockRow> stock;
	private List<ImageView> showcase;
	private String description;

	private Product() {
		categories = new HashSet<ProductCategory>();
		stock = new ArrayList<StockRow>();
		showcase = new ArrayList<ImageView>();
	}

	/**
	 * WM Product Builder.
	 * 
	 * @author Zsadany_Fulop
	 */
	public static final class Builder {
		private Product product;

		private Builder() {
			product = new Product();
			product.categories = new HashSet<ProductCategory>();
			product.stock = new ArrayList<StockRow>();
			product.showcase = new ArrayList<ImageView>();
		}

		public static Builder newProduct(String name, Collection<ProductCategory> categories) {
			Builder builder = new Builder();
			builder.product.id = UUID.randomUUID();
			builder.product.name = name;
			builder.product.categories.addAll(categories);
			return builder;
		}

		public static Builder newProduct(UUID id, String name, ProductCategory category) {
			Builder builder = new Builder();
			builder.product.id = id;
			builder.product.name = name;
			builder.product.categories.addAll(category.toCategories());
			return builder;
		}

		public static Builder newProduct(UUID id, String name, Collection<ProductCategory> categories) {
			Builder builder = new Builder();
			builder.product.id = id;
			builder.product.name = name;
			builder.product.categories.addAll(categories);
			return builder;
		}

		public Builder addCategory(ProductCategory category) {
			product.categories.add(category);
			return this;
		}

		public Builder addCategories(Collection<ProductCategory> categories) {
			product.categories.addAll(categories);
			return this;
		}

		public Builder addRowToStock(StockRow stockRow) {
			product.stock.add(stockRow);
			return this;
		}

		public Builder addStock(Collection<StockRow> stockRows) {
			product.stock.addAll(stockRows);
			return this;
		}

		public Builder addImgViewToShowcase(View show, URI imageURI) {
			product.showcase.add(new ImageView(show, imageURI));
			return this;
		}

		public Builder addDescription(String description) {
			product.description = description;
			return this;
		}

		public Product build() {
			return product;
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

	public List<StockRow> getStock() {
		return stock;
	}

	public List<ImageView> getShowcase() {
		return showcase;
	}

	public String getDescription() {
		return description;
	}
}

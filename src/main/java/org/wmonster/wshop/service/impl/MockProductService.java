package org.wmonster.wshop.service.impl;

import java.math.BigDecimal;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.springframework.stereotype.Service;
import org.wmonster.wshop.model.product.ImageView.View;
import org.wmonster.wshop.model.product.Product;
import org.wmonster.wshop.model.product.params.ProductSize;
import org.wmonster.wshop.model.product.params.Promo;
import org.wmonster.wshop.model.product.params.StockRow;
import org.wmonster.wshop.model.product.params.categories.Category;
import org.wmonster.wshop.model.product.params.categories.ProductCategory;
import org.wmonster.wshop.model.product.search.ProductSearch;
import org.wmonster.wshop.model.product.search.ProductSearchResponse;
import org.wmonster.wshop.service.ProductService;

//TODO replace mock class with live implementation
@Service
public class MockProductService implements ProductService {

	private static final Random rand = new Random();

	@Override
	public ProductSearchResponse getAllProducts() {
		return new ProductSearchResponse(mockPage(1), 1, 15);
	}

	@Override
	public ProductSearchResponse run(ProductSearch productSearch) {
		int page = productSearch.getPage();
		return new ProductSearchResponse(mockPage(page), page, 9);
	}

	private List<Product> mockPage(int page) {
		List<Product> pageList = new ArrayList<Product>();
		for(int item = 1; item <= 6; item++) {
			pageList.add(generateMockProduct(Category.Male.GATYA.toCategories(), page, item));
		}
		return pageList;
	}

	private Product generateMockProduct(Set<ProductCategory> categories, int page, int item) {
		String name = "page" + page + " item" + item;
		String description = name + "! desc page" + page + " item" + item + " desc page" + page + " item" + item + " desc page" + page + " item" + item
				+ " desc page" + page + " item" + item + " desc page" + page + " item" + item + ".";
		URI imageURI = null;
		try {
			imageURI = new URI("/wshop/resources/img/showcase/male/" + item + ".jpg");
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return Product.Builder.newProduct(name, categories)
								.addStock(generateMockStock())
								.addImgViewToShowcase(View.FRONT, imageURI)
								.addDescription(description)
								.build();
	}

	private static final List<StockRow> generateMockStock() {
		List<StockRow> stock = new ArrayList<StockRow>();
		for(int n=0;n < 4; n++)
			stock.add(generateStockRow());
		return stock;
	}

	private static final StockRow generateStockRow() {
		return new StockRow(generateSize(), generateQuantity(), generatePrice(), generatePromo());
	}

	private static final ProductSize generateSize() {
		return ProductSize.values()[rand.nextInt(ProductSize.values().length - 1)];
	}

	private static final int generateQuantity() {
		return 1+rand.nextInt(8);
	}

	private static final BigDecimal generatePrice() {
		return new BigDecimal(rand.nextInt(99) + "." + rand.nextInt(99));
	}

	private static final Promo generatePromo() {
		return Promo.values()[rand.nextInt(Promo.values().length - 1)];
	}
}
package org.wmonster.wshop.model.product;

import java.net.URI;

/**
 * Class containing the showcase image locations of a product.
 * 
 * @author Zsadany_Fulop
 * 
 */
public class ImageView {

	View view;
	URI imageLink;

	public ImageView(View view, URI imageLink) {
		this.view = view;
		this.imageLink = imageLink;
	}

	public View getView() {
		return view;
	}

	public URI getImageLink() {
		return imageLink;
	}

	public static enum View {
		ICON, BOX, FRONT, BACK, LEFT, RIGHT, TOP, BOTTOM, WORN;
	}
}

package org.wmonster.wshop.model.product.params;

public class Image {
	public static final int MAX_CAPACITY = 5000;
	
	private String name;
	private String type;
	private byte[] data;

	public Image(String name, String type, byte[] data) {
		this.name = name;
		this.type = type;
		this.data = data;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public byte[] getData() {
		return data;
	}
}

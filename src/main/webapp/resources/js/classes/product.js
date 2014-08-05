function Product (product) {
	this.id = product.id;
	this.name = product.name;
	this.categories = product.categories;
	this.stock = product.stock;
	this.showcase = product.showcase;
	this.description = product.description;
};

Product.prototype.render = function () {
	var product = $("<div id='" + this.id + "' class=product-info-wrapper>")
    			.append(this.renderImage())
    			.append($("<h1 class=product-title>" + this.name + "</h1>"))
    			.append(this.renderStock())
    			.append($("<div class=product-description>" + this.description + "</div>"))
    			.append($("<a class='buyLink' href='#'>" + "Details" + "</a>"))
    		.append("</div>");
	return product;
};

Product.prototype.renderImage = function () {
	var imageLink = "ImageNotFound";
	this.showcase.forEach(function(entry){
		if(entry.view == "FRONT") {
			imageLink = entry.imageLink;
		}
	});
	return $("<a href='#'><div style='background-image: url(\"" + imageLink + "\")' class=product-image></div></a>");
};

Product.prototype.renderStock = function () {
	var stockContainer = $("<div class=stock>");
	this.stock.forEach(function(entry) {
		stockContainer.append($("<div class=sub-stock>")
				.append($("<div class=size><h2>"+ entry.size +"</h2>"))
				.append($("<div class=quantity>quantity: "+ entry.quantity + "</div>"))
				.append($("<div class=price>price: "+ entry.price +"</div>"))
		);
	});
	return stockContainer;
};
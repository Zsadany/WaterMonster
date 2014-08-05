var getProducts = function() {
	var url = "/wshop/product/search";
	$.getJSON(url, function(data) {
		var items = [];
		$.each(data, function(key, val) {
			items.push("<li id='" + key + "'>" + val + "</li>");
		});
		$("<ul/>", {
			"class" : "my-new-list",
			html : items.join("")
		}).appendTo("#products");
	}).done(function() {
		console.log("success");
	}).fail(function() {
		console.log("error");
	}).always(function() {
		console.log("complete");
	});
	;
};
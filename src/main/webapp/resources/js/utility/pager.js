var searchFrontEndURL = '/wshop/product/search';
var currentPage = 0;
var pageAmount = 0;
var animTime = 300;
var loaded = new Array();

function loadPrevPage() {
	load(currentPage-1);
};

function loadNextPage() {
	load(currentPage+1);
};

function load(page) {
	if((currentPage != page) && (page > 0)) {
		if (loaded[page] != true) {
			$.ajax({
			    async: false,
			    url: searchFrontEndURL +"?page="+ page,
			    dataType:"json",
			    success: function( data ) {
					$("#productPageContainer").append(createProductPageFromJson(data));
					loaded[page] = true;
					pageAmount = data.numberOfPages;
					animateTransitionTo(page);
				}
			});
		} else {
			//FYI: The two animation is a fix to paging problem , do not merge the two animation cases.
			animateTransitionTo(page);
		};
	};
};

function createProductPageFromJson(jsonPage) {
	var container = $('<div id="page' + jsonPage.actualPage + '" class=container></div>');
	jsonPage.productsOnPage.forEach(function(entry) {
		new Product(entry).render().appendTo(container);
	});
	if(jsonPage.actualPage >= currentPage) {
		container.css('top','1636px');
	} else {
		container.css('top','-1564px');
	}
	return container;
};

function animateTransitionTo (next) {
	$('.container').filter(":animated").promise().done(function() {
		(next >= currentPage) ? slideUpward(next) : slideDownward(next);
	});
};

function slideUpward(page) {
	$("#page" + currentPage).animate({ top: '-1564px' }, { queue: true, duration: animTime }, "ease");
	$("#page" + page).animate({ top: '36px' }, { queue: true, duration: animTime }, "ease");
	finalizePageTransition(page);
};

function slideDownward(page) {
	$("#page" + currentPage).animate({ top: '1636px' }, { queue: true, duration: animTime }, "ease");
	$("#page" + page).animate({ top: '36px' }, { queue: true, duration: animTime }, "ease");
	finalizePageTransition(page);
};

function finalizePageTransition(next){
	$('.container').filter(":animated").promise().done(function() {
		currentPage = next;
		generatePageDots(pageAmount, currentPage);
	});
};

function generatePageDots(amount , selected) {
	var navDots=$("#pageDots");
	navDots.empty();
	navDots.append('<h2 class="pageDotHeader">Page</h2>');
	navDots.append("<ol>");
	for(var i=1; i<=amount; i++) {
		var dot=null;
		if(i == selected){
			dot = $('<li id="selected" class="pageDot"><a href="#p' + i + '" onclick="load(' + i + ')">' + i + '</a></li>');
		} else {
			dot = $('<li class="pageDot"><a href="#p' + i + '" onclick="load(' + i + ')">' + i + '</a></li>');
		};
		navDots.append(dot);
	};
	navDots.append("</ol>");
};
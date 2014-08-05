var toSearch = function () {
	clearAnimations();
	$("#searchbar").toggleClass("anim-move-from-right");
	$("#top-menu").toggleClass("anim-move-to-left");
	$("#bottom-menu").toggleClass("anim-move-to-right");
	$("#top-menu").hide();
	$("#bottom-menu").hide();
	$("#searchbar").show();
};

var closeSearch = function () {
	clearAnimations();
	$("#top-menu").toggleClass("anim-move-from-left");
	$("#bottom-menu").toggleClass("anim-move-from-right");
	$("#searchbar").hide();
	$("#top-menu").show();
	$("#bottom-menu").show();
};

var toShowcase = function () {
	clearAnimations();
	$("#showcase").toggleClass("showcase");
	$("#home").toggleClass("anim-move-to-left");
	$("#home").hide();
	$("#showcase").show();
};

var clearAnimations = function () {
	$("#searchbar").removeClass(function (index, css) { return (css.match (/\banim-\S+/g) || []).join(' ');});
	$("#top-menu").removeClass(function (index, css) { return (css.match (/\banim-\S+/g) || []).join(' ');});
	$("#bottom-menu").removeClass(function (index, css) { return (css.match (/\banim-\S+/g) || []).join(' ');});
	$("#slideshow-content").removeClass(function (index, css) { return (css.match (/\banim-\S+/g) || []).join(' ');});
	$("#home").removeClass(function (index, css) { return (css.match (/\banim-\S+/g) || []).join(' ');});
	$("#showcase").removeClass(function (index, css) { return (css.match (/\banim-\S+/g) || []).join(' ');});
};
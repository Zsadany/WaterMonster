<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<c:set var="path"  value="${pageContext.servletContext.contextPath}/resources"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

	<head>
		<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
		<title>Water Monster - WebShop!</title>
		
		<link href="${path}/css/styles.css" rel="stylesheet" />
		<link href="${path}/css/icons.css" rel="stylesheet" />
		<link href="${path}/css/product.css" rel="stylesheet" />
		<link href="${path}/css/menu-anim.css" rel="stylesheet" />
		<link href="${path}/css/page-anim.css" rel="stylesheet" />
		
		<script src="${path}/js/jquery.js"></script>
		<script src="${path}/js/jquery.animate-colors.js"></script>
		<script src="${path}/js/jquery.easing.js"></script>
		<script src="${path}/js/modernizr.js"></script>
		<script src="${path}/js/classes/product.js"></script>
		<script src="${path}/js/utility/pager.js"></script>
	</head>
	
	<body class="body">
		<div id="title"><h1>Water Monster</h1></div>
		<div id="productPageContainer" class="container">
			<script type="text/javascript">
				load(1);
			</script>
		</div>
		<div id="navigation">
			<div id="pageUp" onclick="loadPrevPage()" class="nav"><a href="#"><span class="icon icon-left-open"></span></a></div>
			<div id="pageDown" onclick="loadNextPage()" class="nav"><a href="#"><span class="icon icon-right-open"></span></a></div>
			<div id="pageDots" class="nav"></div>
		</div>
	</body>
	
</html>
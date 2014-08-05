<!-- http://fontello.com/     icon generalas a menuhoz-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<c:set var="path"  value="${pageContext.servletContext.contextPath}/resources"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
		<title>Water Monster - WebShop!</title>
		
		<link href="${path}/css/styles.css" rel="stylesheet" />
		<link href="${path}/css/skitter.styles.css" rel="stylesheet" />
		<link href="${path}/css/menu.css" rel="stylesheet" />
		<link href="${path}/css/menu-anim.css" rel="stylesheet" />
		<link href="${path}/css/searchbar.css" rel="stylesheet" />
		<link href="${path}/css/icons.css" rel="stylesheet" />
		<link href="${path}/css/login.css" rel="stylesheet" />
		<link href="${path}/css/showcase.css" rel="stylesheet" />
		
		<script src="${path}/js/jquery.js"></script>
		<script src="${path}/js/jquery.animate-colors.js"></script>
		<script src="${path}/js/jquery.easing.js"></script>
		<script src="${path}/js/jquery.skitter.js"></script>
		<script src="${path}/js/login.js"></script>
		<script src="${path}/js/modernizr.js"></script>
	 	<script src="${path}/js/slideshow.js"></script>
	 	<script src="${path}/js/transition.js"></script>
	</head>
	<body class="body">
		<div id="title"><h1>Water Monster</h1></div>
		<div id="home">
			<jsp:include page="showcase.jsp" />
			<div id="menu_page">
				<jsp:include page="slideshow.jsp" />
				<jsp:include page="menu.jsp" />
			</div>
			<jsp:include page="login.jsp" />
			<jsp:include page="reg.jsp" />
		</div>
	</body>
</html>


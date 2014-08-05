<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<c:set var="path" value="${pageContext.servletContext.contextPath}/resources" />

<div id="slideshow-content" class="anim-move-from-top">
	<div class="border_box">
		<div class="box_skitter box_skitter_large">
			<ul>
				<li><a href="#cubeRandom"><img src="${path}/img/slideshow/vizilabdas_ordog.jpg" class="swapBarsBack" /></a>
					<div class="label_text"> <p>Femmes</p></div>
				</li>
				<li><a href="#cube"><img src="${path}/img/slideshow/vizilabdas_angyal.jpg" class="swapBarsBack" /></a>
					<div class="label_text"><p>Hommes</p></div>
				</li>
				<li><a href="#angyal"><img src="${path}/img/slideshow/muuszo_angyal.jpg" class="swapBarsBack" /></a>
					<div class="label_text"><p>Hommes</p></div>
				</li>
				<li><a href="#femmes"><img src="${path}/img/slideshow/muuszo_ordog.jpg" class="swapBarsBack" /></a>
					<div class="label_text"><p>Femmes</p></div>
				</li>
				<li><a href="#enfants"><img src="${path}/img/slideshow/uszo_angyal.jpg" class="swapBarsBack" /></a>
					<div class="label_text"><p>Enfants</p></div>
				</li>
				<li><a href="#accessoirs"><img src="${path}/img/slideshow/uszo_ordog.jpg" class="swapBarsBack" /></a>
					<div class="label_text"><p>Accessoires</p></div>
				</li>
			</ul>
		</div>
	</div>
</div>
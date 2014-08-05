<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path"  value="${pageContext.servletContext.contextPath}/resources"/>
    
    <div id="showcase" class="showcase">
		<section id="ps-container" class="ps-container">
		
			<div class="ps-header">
				<h1>Collection Hommes</h1>
			</div>
			
			<div class="ps-contentwrapper">
			
				<div class="ps-content">
					<h2>No csikos cuccban</h2>
					<h3 class="ps-price">100 E</h3>
					<p>With restful springiness in the seat; prevents static sitting and provides enhanced seating comfort. Padded seat and back for enhanced seating comfort. Soft, hardwearing and easy care leather, which ages gracefully.</p>
					<div class="size-container">
						<h3 class="info-header">Tailles disponibles:</h3>
						<span class="size">S</span>
						<span class="size">M</span>
						<span class="size">L</span>
						<span class="size">XL</span>
					</div>
					<a href="http://www.ikea.com/gb/en/catalog/products/80163804/#/60203882">Ajouter au Pannier</a>
				</div>
				
				<div class="ps-content">
					<h2>Kek rucis csaj</h2>
					<h3 class="ps-price">65 E</h3>
					<p>For increased stability, re-tighten the screws about two weeks after assembly. Seat and back with restful flexibility; prevents a static sitting posture and enhances comfort.</p>
					<div class="size-container">
						<h3 class="info-header">Tailles disponibles:</h3>
						<span class="size">S</span>
						<span class="size">M</span>
						<span class="size">L</span>
						<span class="size">XL</span>
					</div>
					<a href="http://www.ikea.com/gb/en/catalog/products/90185320/#/20115038">Ajouter au Pannier</a>
				</div>
				
				<div class="ps-content">
					<h2>Buksza feketeben</h2>
					<h3 class="ps-price">140 E</h3>
					<p>Frame made of layer-glued bent birch; a very strong and durable material. High back provides great support for your neck. Sheepskin has natural insulating properties, which make it feel warm and cosy to sit on. Extra cushions are available for variation and renewal.</p>
					<div class="size-container">
						<h3 class="info-header">Tailles disponibles:</h3>
						<span class="size">S</span>
						<span class="size">M</span>
						<span class="size">L</span>
						<span class="size">XL</span>
					</div>
					<a href="http://www.ikea.com/gb/en/catalog/products/S79889694/#/S59901017">Ajouter au Pannier</a>
				</div>
				
				<div class="ps-content">
					<h2>James Bond Gatya</h2>
					<h3 class="ps-price">30 E</h3>
					<p>Bazzeg hallod , látod ezt? James Bond is ezt a gatyát hordja, ebbe alszik ebbe eszik, még az öltönye alá is ezt veszi fel vazze! Na vedd meg de nagyon gyorsan ! Limitalt kiadas, kaphato feketeben is!</p>
					<div class="size-container">
						<h3 class="info-header">Tailles disponibles:</h3>
						<span class="size">S</span>
						<span class="size">M</span>
						<span class="size">L</span>
						<span class="size">XL</span>
					</div>
					<a href="http://www.ikea.com/gb/en/catalog/products/70224756/">Ajouter au Pannier</a>
				</div>
				
				<div class="ps-content">
					<h2>Gatya!</h2>
					<h3 class="ps-price">195 E</h3>
					<p>Ó ez a gatya hallod, beszarsz olyan kényelmes ! És van barnában is ha fenn álna a veszély hogy átlátszó a víz! Tapadnak majd ra'd a csajok ha hordod! </p>
					<div class="size-container">
						<h3 class="info-header">Tailles disponibles:</h3>
						<span class="size">S</span>
						<span class="size">M</span>
						<span class="size">L</span>
						<span class="size">XL</span>
					</div>
					<a href="http://www.ikea.com/gb/en/catalog/products/S99895000/#/S69894380">Ajouter au Pannier</a>
				</div>
				
			</div>
			
			<div class="ps-footer">
				<a href=""><span> &lt Return</span></a>
			</div>
			
			<div class="ps-slidewrapper">
				<div class="ps-slides">
					<div style="background-image:url(${path}/img/showcase/male/1.jpg);"></div>
					<div style="background-image:url(${path}/img/showcase/male/2.jpg);"></div>
					<div style="background-image:url(${path}/img/showcase/male/3.jpg);"></div>
					<div style="background-image:url(${path}/img/showcase/male/4.jpg);"></div>
					<div style="background-image:url(${path}/img/showcase/male/5.jpg);"></div>
				</div>
				<nav>
					<a href="#" class="ps-prev" ></a>
					<a href="#" class="ps-next" ></a>
				</nav>
			</div>
			
		</section>
        
		<script type="text/javascript" src="${path}/js/slider.js"></script>
		<script type="text/javascript">
			$(function() {
				Slider.init();
			});
		</script>
    </div>
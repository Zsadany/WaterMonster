<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path"  value="${pageContext.servletContext.contextPath}/resources"/>

<div id="reg-box" class="reg-popup">
	<a href="" class="close"><img src="${path}/img/login/close_pop.png" class="btn_close" title="Close Window" alt="Close" /></a>
	<form method="post" class="signin" action="#">
		<fieldset class="textbox">
			<label class="username"> <span>email<em style="color:red">*</em></span> 
				<input id="username" name="username" value="" type="email" autocomplete="on" placeholder="Username">
			</label> 
			<label class="password"> <span>Mot-de-pass<em style="color:red">*</em></span> 
				<input id="password" name="password" value="" type="password" placeholder="Mot-de-pass">
			</label>
			<label class="password"> <span>Mot-de-pass verification<em style="color:red">*</em></span> 
				<input id="password" name="password" value="" type="password" placeholder="Mot-de-pass-encore">
			</label>
			<label class="lname"> <span>Nom de famille</span> 
				<input id="lname" name="last_name" value="" type="text" autocomplete="on" >
			</label> 
			<label class="Nom de kereszt"> <span>Nom de kereszt</span> 
				<input id="fname" name="first_name" value="" type="text" autocomplete="on" >
			</label> 

			<button class="submit button" type="button">Créez un compte!</button>

			<p><a class="forgot" href="#">Policy</a></p>
		</fieldset>
	</form>
</div>
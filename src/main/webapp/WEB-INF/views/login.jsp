<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path"  value="${pageContext.servletContext.contextPath}/resources"/>

<div id="login-box" class="login-popup">
	<a href="" class="close"><img src="${path}/img/login/close_pop.png" class="btn_close" title="Close Window" alt="Close" /></a>
	<form method="post" class="signin" action="#">
		<fieldset class="textbox">
			<label class="username"> <span>email</span> 
				<input id="username" name="username" value="" type="email" autocomplete="on" placeholder="Username">
			</label> 
			<label class="password"> <span>Password</span> 
				<input id="password" name="password" value="" type="password" placeholder="Password">
			</label>

			<button class="submit button" type="button">se connectez</button>

			<p><a class="forgot" href="#">Mot-de-pass oublié?</a></p>
		</fieldset>
	</form>
</div>
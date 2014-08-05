var showLogin = function() {
	
	// Getting the variable's value from a link 
	var loginBox = $('#login-box');

	//Fade in the Popup and add close button
	$(loginBox).fadeIn(300);
	
	//Set the center alignment padding + border
	var popMargTop = ($(loginBox).height() + 24) / 2; 
	var popMargLeft = ($(loginBox).width() + 24) / 2; 
	
	$(loginBox).css({ 
		'margin-top' : -popMargTop,
		'margin-left' : -popMargLeft
	});
	
	// Add the mask to body
	$('body').append('<div id="mask"></div>');
	$('#mask').fadeIn(300);
	
	$('a.close, #mask').live('click', function() { 
		$('#mask , .login-popup').fadeOut(300 , function() {
			$('#mask').remove();  
		}); 
		return false;
	});
	return false;
};


var showRegistration = function() {
	// Getting the variable's value from a link 
	var regBox = $('#reg-box');

	//Fade in the Popup and add close button
	$(regBox).fadeIn(300);
	
	//Set the center alignment padding + border
	var popMargTop = ($(regBox).height() + 24) / 2; 
	var popMargLeft = ($(regBox).width() + 24) / 2; 
	
	$(regBox).css({ 
		'margin-top' : -popMargTop,
		'margin-left' : -popMargLeft
	});
	
	// Add the mask to body
	$('body').append('<div id="mask"></div>');
	$('#mask').fadeIn(300);
	
	$('a.close, #mask').live('click', function() {
		$('#mask , .reg-popup').fadeOut(300 , function() {
			$('#mask').remove();  
		}); 
		return false;
	});
	return false;
};
$(function() {
	// solving the active menu problem
	switch (menu) {
	
	case 'Login':
		$('#admin').addClass('active');
		break;

	
	case 'Admin':
		$('#admin').addClass('active');
		break;

	case 'Student':
		$('#student').addClass('active');
		break;

	case 'Faculty':
		$('#faculty').addClass('active');
		break;

	case 'Contact Us':
		$('#contact').addClass('active');
		break;

	case 'About Us':
		$('#about').addClass('active');
		break;

	default:
		$('#home').addClass('active');
		break;
	}

});
$(document).ready(function(){
	$(".mal").mouseenter(function(){     /*remove this line for auto load*/
		$('.skillbar').each(function(){
			$(this).find('.skillbar-bar').animate({
				width:$(this).attr('data-percent')
			},6000);
		});
	});
	/*$(window).unload(function(){
    	alert("Goodbye!");
	});*/
});
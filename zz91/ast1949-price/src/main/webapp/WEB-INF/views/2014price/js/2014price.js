$(document).ready(function(e) {
    $("#24hour1").mouseover(function(){
		$(this).removeClass("m1-24hour-border2");
		$(this).removeClass("m1-24hour-green");
		$(this).addClass("m1-24hour-border1");
		$(this).addClass("m1-24hour-gray");
		$("#24hour2").removeClass("m1-24hour-border1");
		$("#24hour2").removeClass("m1-24hour-gray");
		$("#24hour2").addClass("m1-24hour-border2");
		$("#24hour2").addClass("m1-24hour-green");
		$("#24hour_ul1").css("display","block");
		$("#24hour_ul2").css("display","none");
	});
	$("#24hour1").mouseout(function(){
		$(this).removeClass("m1-24hour-border1");
		$(this).removeClass("m1-24hour-gray");
		$(this).addClass("m1-24hour-border2");
		$(this).addClass("m1-24hour-green");
		$("#24hour2").removeClass("m1-24hour-border2");
		$("#24hour2").removeClass("m1-24hour-green");
		$("#24hour2").addClass("m1-24hour-border1");
		$("#24hour2").addClass("m1-24hour-gray");
		$("#24hour_ul2").css("display","block");
		$("#24hour_ul1").css("display","none");
	});
	
	$("#24hour2").mouseover(function(){
		$(this).removeClass("m1-24hour-border2");
		$(this).removeClass("m1-24hour-green");
		$(this).addClass("m1-24hour-border1");
		$(this).addClass("m1-24hour-gray");
		$("#24hour1").removeClass("m1-24hour-border1");
		$("#24hour1").removeClass("m1-24hour-gray");
		$("#24hour1").addClass("m1-24hour-border2");
		$("#24hour1").addClass("m1-24hour-green");
		$("#24hour_ul2").css("display","block");
		$("#24hour_ul1").css("display","none");
	});
	$("#24hour2").mouseout(function(){
		$(this).removeClass("m1-24hour-border1");
		$(this).removeClass("m1-24hour-gray");
		$(this).addClass("m1-24hour-border2");
		$(this).addClass("m1-24hour-green");
		$("#24hour1").removeClass("m1-24hour-border2");
		$("#24hour1").removeClass("m1-24hour-green");
		$("#24hour1").addClass("m1-24hour-border1");
		$("#24hour1").addClass("m1-24hour-gray");
		$("#24hour_ul1").css("display","block");
		$("#24hour_ul2").css("display","none");
	});
	$("#change").click(function(){
		if($("#changeId").val()==1){
			$("#change_main1").stop().fadeOut();
			$("#change_main2").stop().fadeIn();
			$("#change_main1").css("display","none");
			$("#change_main2").css("display","block");
			$("#changeId").val(2);
		}else{
			$("#change_main2").stop().fadeOut();
			$("#change_main1").stop().fadeIn();
			$("#change_main2").css("display","none");
			$("#change_main1").css("display","block");
			$("#changeId").val(1);
		}
	});
	
});
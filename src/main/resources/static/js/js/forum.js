<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" ></script>

	<script>
	  $("#attach").click(function(){
		  $(".attachement").toggle();
		});
	</script>
	<script>
	  $("#dset").click(function(){
		  $(".setting-drop").toggle('1000');
		});
	</script>

	<script>
	$(document).ready(function(){
    $(".flip").click(function(){
        $(".message-box").show("slide", { direction: "right" }, 10000);
    });
});
 </script>
 <script>
	$(document).ready(function(){
    $("#back").click(function(){
        $(".message-box").hide("slide", { direction: "left" }, 10000);
    });
});
 </script>
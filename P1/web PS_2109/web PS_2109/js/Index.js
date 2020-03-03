$(document).ready(function()    {
    $("#request_temp").click(function(e)    {
        $.ajax({
            type: 'GET',
            url: 'http://api.openweathermap.org/data/2.5/weather?q=Cluj-Napoca&appid=ea1863083f37f636a3d408f54bc64c79',
            dataType: 'json',
            success: function(data){
                $("#temp").attr("placeholder", (data.main.temp - 273.15));
            },
            error: function(){
                $("#temp").html("error")
            }

        });
    });
});
$(document).ready(function()    {
   
	$("#request_temp1").click(function(e)    {
        $.ajax({
            type: 'GET',
            url: 'http://127.0.0.1:8080/city/'+$("#temp1").val(),
            dataType: 'json',
            success: function(data){
				console.log("test");
				console.log(data);
                $("#temp1").attr("placeholder", (data.id));
            },
            error: function(){
				console.log("error");
                $("#temp1").html("error");
            }

        });
    });
	
    $("#request_all").click(function(e)    {
        $.ajax({
            type: 'GET',
            url: 'http://127.0.0.1:8080/city/all',
            dataType: 'json',
            success: function(data){
				console.log("test");
			for(let i = 0; i < data.length; i++)
				{ 
					console.log(data[i]);
					$("#t1").attr("placeholder", (data[0].id));
					$("#t2").attr("placeholder", (data[0].nume));
					$("#t3").attr("placeholder", (data[0].descriere));
				    $("#t4").attr("placeholder", (data[0].imageURL));

					$("#t5").attr("placeholder", (data[1].id));
					$("#t6").attr("placeholder", (data[1].nume));
					$("#t7").attr("placeholder", (data[1].descriere));
					$("#t8").attr("placeholder", (data[1].imageURL));
                         
					$("#t9").attr("placeholder", (data[2].id));
					$("#t10").attr("placeholder", (data[2].nume));
					$("#t11").attr("placeholder", (data[2].descriere));
					$("#t12").attr("placeholder", (data[2].imageURL));
                         
					
				}
            },
            error: function(){
				console.log("error");
                $("#t1").html("error");
            }

        });
    });
	
	$('#request_delete').click(function () {
				var id=$("#temp4").val();
				console.log(id);
            $.ajax({
				type: 'DELETE',
				url: 'http://127.0.0.1:8080/city/delete',
				//dataType: 'json',
				//data:id,

                success: function () {
					//console.log(data);
                    alert('city deleted');
                   
                },
                error: function () {
					//console.log(data.id);
                    alert('EROARE');
                }
            })
        })
		
	$('#request_add').click(function () {
				//var id=$("#temp4").val();
				var cityAd={
				
		    id:	$("#id").val(),
            nume:$("#nume").val(),
		    descriere:$("#descrier").val(),	 
		    imageURL: $("#imageURL").val(),
	
		 }
				console.log(cityAd);
            $.ajax({
				type: 'post',
				url: 'http://127.0.0.1:8080/city/add',
				dataType: 'json',
				headers: {
				'Content-Type': 'application/json',
				'Accept' : "*/*",
			},
			data: JSON.stringify(cityAd),
				
				
                success: function () {
					console.log(cityAd);
                    alert('city added');
                  
                },
                error: function () {
					//console.log(cityAd);
                    alert('EROARE');
                }
            })
        })
		
});
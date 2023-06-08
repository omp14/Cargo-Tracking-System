$(document).ready(
function(){
	
$('#btn').click(function(){
	$.getJSON("SearchByTrackingIdJSONCRM",{ajax:true,tid:$('#tid').val()},function(data){
	//	transactionid, trackingid, employeeid, currdate, currtime, conversation, action
		var h='<table>';
	 h+='<tr><td valign=top>';

h+='<table border=1 width=400 >';
	h+='<tr><th>Transaction Id</th><th>EMPLOYEE ID</th><th>DATE</th><th>TIME</th><th>Conversation</th><th>Action</th></tr>';
	$.each(data,function(i,item){
		h+='<tr><td>'+item.TRANSACTIONID+'</td><td>'+item.EMPLOYEEID+'</td><td>'+item.CURRDATE+'</td><td>'+item.CURRTIME+'</td><td>'+item.CONVERSATION+'</td><td>'+item.ACTION+"</td></tr>";
		
	});	 
    h+='</table></td>';
    h+='<td valign=top>';
    h+='<table>';
    h+='<caption><b>Insert CRM Details Here</b></caption>'
        h+='<tr><td><i>Current Date:</i></td><td><input type=text id=tcd></td></tr>';
        h+='<tr><td><i>Current Time:</i></td><td><input type=text id=tct></td></tr>';
        h+='<tr><td><i>Conversation:</i></td><td><textarea id=td rows=5 cols=30></textarea></td></tr>';
        h+='<tr><td><i>Action:</i></td><td><input type=text id=action></td></tr>';
        
        h+='<tr><td><input type=button value=Submit id=sbtn><br><br><span id=msg>......</span></td><td>&nbsp;</td></tr>';
        h+='</table></td></tr></table><br>';
        $('#result').html(h);	
	});

});//transactionid, 


$('#result').on('click','#sbtn',function(){
	
	//alert($('#eid').val());
	$.getJSON("InsertCRMJSON",{ajax:true,tid:$('#tid').val(),eid:$('#eid').val(),tcd:$('#tcd').val(),tct:$('#tct').val(),td:$('#td').val(),action:$('#action').val()},function(data){
		$('#msg').html(data.message);
	});
});
});



 	
 

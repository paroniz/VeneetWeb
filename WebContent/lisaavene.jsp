<%@include file="onkokirjauduttu.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.15.0/jquery.validate.min.js"></script>
<link rel="stylesheet" type="text/css" href="main.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lisää vene</title>
</head>
<body>
<form action="LisaaVene" method="post" name="lisaaLomake" id="lisaaLomake">
<table>
<tr>
<th align="right" class="pysty" style="width:33%">Nimi:</th>
<td><input type="text" name="nimi" id="nimi"></td>
</tr>
<tr>
<th align="right" class="pysty">Merkki ja malli:</th>
<td><input type="text" name="merkkimalli" id="merkkimalli"></td>
</tr>
<tr>
<th align="right" class="pysty">Pituus:</th>
<td><input type="text" name="pituus" id="pituus"></td>
</tr>
<tr>
<th align="right" class="pysty">Leveys:</th>
<td><input type="text" name="leveys" id="leveys"></td>
</tr>
<tr>
<th align="right" class="pysty">Hinta:</th>
<td><input type="text" name="hinta" id="hinta"></td>
</tr>
<tr>
<td colspan="2" class="painikkeet"><input type="submit" value="Lisää">
<input type="button" value="Kaikki veneet" id="kaikki"></td>
</tr>
</table>
</form>
<% 
if(request.getParameter("ilmo")!=null){
if(request.getParameter("ilmo").equals("1")){
	out.print("Veneen lisääminen onnistui");
}else if(request.getParameter("ilmo").equals("0")){
	out.print("Veneen lisääminen ei onnistunut");
}
}
%>
<br>
<script>
	$(document).ready(function(){
		$("#etunimi").focus();
		 $("#kaikki").click(function(){	    	
		    	window.location.href = 'ListaaVeneet';
	});
	$("#lisaaLomake").validate({						
		rules: {
			nimi:  {
				required: true,
				minlength: 2
			},	
			merkkimalli:  {
				required: true,
				minlength: 2
			},
			pituus:  {
				required: true,
				minlength: 1
			},	
			leveys:  {
				required: true,
				minlength: 1
			},
			hinta:  {
				required: true,
				minlength: 1
			}		
		},
		messages: {
			nimi: {
				required: "Pakollinen",
				minlength: "Pituus ei riitä"
				
			},
			merkkimalli: {
				required: "Pakollinen",
				minlength: "Pituus ei riitä"
			},
			pituus: {
				required: "Pakollinen",
				minlength: "Pituus ei riitä"
			},
			leveys: {
				required: "Pakollinen",
				minlength: "Pituus ei riitä",
			},
			hinta: {
				required: "Pakollinen",
				minlength: "Pituus ei riitä",
			}
		
		},			
		submitHandler: function (form) {				
			document.forms["lisaaLomake"].submit();
		}		
	});
});
	
</script>
</body>
</html>
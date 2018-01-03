<%@include file="onkokirjauduttu.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "dao.Dao" %>    
<%@ page import = "model.Vene" %>  
<%@ page import = "java.util.ArrayList"%>  
<%! @SuppressWarnings("unchecked")%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="main.css">
<title>Kaikki veneet</title>
</head>
<body>
<%--Painikkeet muille sivuille siirtymiseen--%>
<input type="button" value="lisää uusi vene" id="lisaa">
<input type="button" value="hae veneistä" id="hae">
<% 
if(request.getParameter("ilmo")!=null){
	out.print(request.getParameter("ilmo"));
}
%>
<br><br>
<table>
<tr>
<th class="vaaka">Tunnus</th>
<th class="vaaka">Nimi</th>
<th class="vaaka">Merkki ja malli</th>
<th class="vaaka">Pituus</th>
<th class="vaaka">Leveys</th>
<th class="vaaka">Hinta</th>
<th></th>
</tr>
<%
/* request.getAttribute hakee veneet-attribuutin ja siitä tehdään uusi ArrayList. ArrayList printataan ulos olio kerrallaan */
if(request.getAttribute("veneet")!=null){
ArrayList<Vene> veneet = (ArrayList<Vene>)request.getAttribute("veneet");
for(int i=0;i<veneet.size();i++){
	out.print("<tr>");
	out.print("<td>" + veneet.get(i).getTunnus() + "</td>");
	out.print("<td>" + veneet.get(i).getNimi() + "</td>");
	out.print("<td>" + veneet.get(i).getMerkkimalli()+ "</td>");
	out.print("<td>" + veneet.get(i).getPituus()+ "</td>");
	out.print("<td>" + veneet.get(i).getLeveys()+ "</td>");
	out.print("<td>" + veneet.get(i).getHinta() + "</td>");
	out.print("<td><a class='poista' href='PoistaVene?tunnus="+veneet.get(i).getTunnus()+"'><abbr title='Poista'>X  </abbr></a>");
	out.print("<a class='muuta' href='EtsiMuutaVene?tunnus="+veneet.get(i).getTunnus() +"'><abbr title='Muuta'>M</abbr></a></td>");
	out.print("</tr>");
}
}
%>
</table>
<script>
	$(document).ready(function(){
		$("#hakusana").focus();
	    $("#lisaa").click(function(){
	    	window.location.href = 'lisaavene.jsp';
	    });
	    	$("#hae").click(function(){
	 	    	window.location.href = 'haeveneet.jsp';
	    });
	});
</script>
</body>
</html>
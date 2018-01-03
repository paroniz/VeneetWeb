<%-- Käyttäjän kirjautumisen tarkistus --%>
<%
if(session.getAttribute("kayttaja")==null){	
	response.sendRedirect("index.jsp");
	return;
}else{
	out.print("Kirjautuneena: " + session.getAttribute("kayttaja") + "<BR>");
}
%>
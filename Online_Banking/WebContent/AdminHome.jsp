<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% 
	  	String uid=(String)session.getAttribute("msg");
 if(uid==null)
 {
 
	 response.sendRedirect("Aindex.jsp");
 
}
	   %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Home</title>
<%@include file="Navbar.jsp" %>
<h1 align="center">Wellcome=<%=uid%></h1>
<br/>
<h1>Admin HOME PAGE</h1>



</body>
</html>
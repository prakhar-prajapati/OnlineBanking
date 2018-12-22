<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<% 
	  	Integer uid=(Integer)session.getAttribute("msg");
 if(uid==0)
 {
  response.sendRedirect("index.jsp");

}
%>
<%@include file="UserNavbar.jsp" %>
<h1>wellcom=<%=uid %></h1>
<br/>
<h1 align="center">USER LOGIN PAGE</h1>
						
<a href=CheckBalance>SHOW ACCOUNT BALANCE</a>
<br/>
<a href=Transection.jsp >TANSFER MONEY</a>
				
</body>
</html>
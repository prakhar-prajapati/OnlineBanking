<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Data</title>
<%@include file="Navbar.jsp" %>
<%@page import="java.util.ArrayList,bean.beanBank" %>
<% 
	  	String uid=(String)session.getAttribute("msg");
 if(uid==null)
 {
 
	 response.sendRedirect("Aindex.jsp");
 
}
	   %>

<h1>welcom<%=uid %></h1>
<table class="table table-hover">
<tr><th>CID</th><th>NAME</th><th>ADDRESS</th><th>MOBILE NO.</th><th>E-MAIL</th><th>ACCOUNT_NO></th><th>PASSWORD</th><th>BALANCE</th></tr>
<%
ArrayList<beanBank> list= (ArrayList<beanBank>)request.getAttribute("List");
%>
<%
for(beanBank ee:list)
{
%>
<tr>
<td><%=ee.getCid() %></td>
<td><%=ee.getName() %></td>
<td><%=ee.getAddress() %></td>
<td><%=ee.getMobile() %></td>
<td><%=ee.getEmail() %></td>
<td><%=ee.getAccount() %></td>
<td><%=ee.getPassword() %></td>
<td><%=ee.getBalance() %></td>
<%
}
%>
</table>
</body>
</html>
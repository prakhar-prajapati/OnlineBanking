<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create account</title>
<%@include file="Navbar.jsp" %>
<% 
	  	String uid=(String)session.getAttribute("msg");
 if(uid==null)
 {
 
	 response.sendRedirect("Aindex.jsp");
 
}
	   %>

<center>
<h1>CREATE ACCOUNT</h1>
<form action="CreateAccount" method="post">
<pre>

<%
String msgs=(String)request.getAttribute("m");
if(msgs!=null)
{
out.println(msgs);
}
%>

NAME        <input type="text" name="cname" /><br/><br/>
ADDRESS     <input type="text" name="caddress" /><br/><br/>
MOBILE NO.  <input type="text" name="cmobile" /><br/><br/>
EMAIL-ID    <input type="email" name="cemail" /><br/><br/>
ACCOUNT-NO. <input type="number" name="caccount" /><br/><br/>
PASSWORD    <input type="text" name="cpassword" /><br/><br/>
BALANCE     <input type="number" name="cbalance" /><br/><br/>
            <input type="Submit" value="SUBMIT" />
</pre>
</center>
</form>
</body>
</html>
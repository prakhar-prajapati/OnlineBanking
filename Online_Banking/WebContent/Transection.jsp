<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BALNACE</title>
<% 
	  	Integer uid=(Integer)session.getAttribute("msg");
 if(uid==null)
 {
  response.sendRedirect("index.jsp");

}
%>
<%@include file="UserNavbar.jsp" %>
<h1 align="center">wellcome=<%=uid %></h1><center>
<h1 style="color: red">TRANSECTION PAGE</h1>
<hr/>
<form action=Transection method="post" >
  <div class="form-group">
  <label>ENTER SENDER ACCOUNT NO:</label>
  <input type="text" name="saccount" >
  </div>
<div class="form-group">
<label>ENTER AMMOUNT:</label>
<input type="text" name="ammount" >
  </div>
  <div class="checkbox">
    <label><input type="checkbox"> Remember me</label>
  </div>
  <button type="submit" class="btn btn-default">Submit</button>
</form>

</body>
</html>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<%
response.addHeader("pragma", "no-cache");
response.addHeader("cache-control", "no-store");
response.addHeader("expire", "0");
%>

</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="UserHome.jsp">ONLINE BANKING</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active "><a href="UserHome.jsp">Home</a></li>
      <li><a href="CheckBalance">CHECK BALANCE</a></li>
      <li><a href="Transection.jsp">TRANSECTION</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="UserLogout.jsp"><span class="glyphicon glyphicon-log-in"></span>LOGOUT</a></li>
    </ul>
  </div>
</nav>

<!-- <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FRONT PAGE</title>
<style type="text/css">
 
 body{
margin: 0px;
padding:0px;
background-color:#E6E6FA;
letter-spacing: 1px;
}

h1{
text-align: center;
text-decoration: underline;
}

fieldset{
border:1px red solid;
width:250px;
height:250px;
margin-left:500px;
margin-top:80px;
background: rgba(0,0,0,0.3);

}

label{
font-family: sans-serif;
text-transform: uppercase;
} 

::placeholder{
font-size: 17px;
}
input[type="password"]
{
 border:none;
 background: none;
 border-bottom: solid #fff 1px;
}
input[type="text"]
{
 border:none;
 background: none;
 border-bottom: solid #fff 1px;
padding: 10px;
box-sizing: border-box;
}
input[type="password"]
{
 border:none;
 background: none;
 border-bottom: solid #fff 1px;
padding:10px;
box-sizing: border-box;
}

input[type="submit"]
{
 border:none;
 background-color: red;
 padding: 15px;
 cursor:pointer;
 border-radius:20px;
}

input[type="submit"]:hover
{
padding-right: 50px;
padding-left: 50px;
}
legend{
font-size: 30px;
}

a{
text-decoration:none;
margin-left: 13cm;
}

</style>
  
</head>
<body>
${msg}
<div class="container">
<h1 style="font-family: sans-serif; color: blue;">WELLCOME TO ONLINE BANKING</h1>
<hr/>
<fieldset>
<legend>Login</legend>
<form  action="UserLogin" method="post">
<label>ENTER ACCOUNT-NO.</label>
<br/><input type="text" name="uid" placeholder="Enter here" />
<br/><br/>
<label>PASSWORD</label>
<br/><input type="password" name="upass" placeholder="******" />
<br/><br/>
             <input type="Submit" value="LOGIN">

</form>
</fieldset>
<br/><br/>
<a href="Aindex.jsp">CLICK HERE FOR ADMIN LOGIN PAGE</a>
</div>
</body>
</html>
 -->
  <!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
font-family: Arial, Helvetica, sans-serif;
letter-spacing: 1px;
background:url("images/a.jpg");
background-attachment: fixed;
background-size: cover; 
}
form 
{
border: 3px solid #f1f1f1;
width:350px;;
margin: 0 auto;
background: rgba(0,0,0,0.7); 	
}

input[type=text], input[type=password] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

.button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

.button:hover {
  opacity: 0.8;
}

.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}

.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
}

img.avatar {
  width: 20%;
  border-radius: 50%;
}

.container {
  padding: 16px;
}

span.psw {
  float: right;
  padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.psw {
     display: block;
     float: none;
  }
  .cancelbtn {
     width: 100%;
  }
}
h2{
text-align: center;
}
.a
{
color:#efed40;
font-weight:bolder;
     text-transform:uppercase;    
    text-align: center;
    display:block;
    }
label{
color:#efed40;
}
</style>
</head>
<body>

<h2>Login Form</h2>

<form action="UserLogin" method="post">
  <div class="imgcontainer">
    <img src="images/avtar.png" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <label for="uid"><b>ACCOUNT NUMBER</b></label>
  <input type="text" placeholder="Enter account-no." name="uid" required>

    <label for="upass"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="upass" required>
        
    <input class="button" type="Submit" value="LOGIN">
     <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</form>
 <br/> <br/>
<a class="a" href="Aindex.jsp">CLICK HERE FOR ADMIN LOGIN PAGE</a>

</body>
</html>
<%-- 
    Document   : Login
    Created on : 25 Oct, 2015, 10:54:01 PM
    Author     : vasu jain
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>How it works</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
     <link rel="stylesheet" href="css/styles.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span> 
      </button>
      <a class="navbar-brand" href="#">Blood Bank Portal</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
      <li class="active"><a href="index.html">Home</a></li>
        <li><a href="how.html">How it Works</a></li>
        <li><a href="map.html">Search a Blood Group</a></li> 
        <li><a href="conn.html">Contact Us</a></li> 
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="signup.html"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
        <li><a href="login.html"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
    </div>
  </div>
</nav>	


 <div class="row"  style="margin-top:-1%;">
    <h2 class="text-info" style="text-align:center">User Login</h2>
    <div class="col-md-8 col-md-offset-3" style="margin-top: 1%;">
        <form class="form-horizontal" action="UserLogin.jsp" method="POST" role="form">
                <div class="form-group">
                    <label for="firstname" class="col-md-2 control-label">Username</label>
                    <div class="col-md-6">
                        <input type="email" required name="username" class="form-control" id="firstname"
                        placeholder="Username(Email ID You Are Registered With)">
                    </div>
                </div>
                <div class="form-group">
                    <label for="lastname" class="col-sm-2 control-label">Password</label>
                    <div class="col-md-6">
                        <input type="password" required  name="password" class="form-control" id="lastname"
                        placeholder="Password">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-md-6">
                        <button type="submit" name="submit" class="btn btn-info btn-md btn-block">Sign in</button>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <label><center>If Not Already Registered Then ->> <a href="signup.html"> Sign Up</a></center></label>
                    </div>
                </div>
            </form>
        </div>
</div>
</body>
<%-- 
    Document   : SignUp
    Created on : 24 Oct, 2015, 9:25:56 PM
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
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="bootstrap/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="css/styles.css">
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
    <h2 class="text-info" style="text-align:center">User Registration</h2>
    <div class="col-md-8 col-md-offset-3" style="margin-top: 1%;">
        <form class="form-horizontal" action="saveServer" method="POST" role="form">
                <div class="form-group">
                    <label for="name" class="col-md-2 control-label">Name : </label>
                    <div class="col-md-6">
                        <input type="name" required name="name" class="form-control" id="name"
                        placeholder="Enter Your Full Name">
                    </div>
                </div>
                <div class="form-group">
                    <label for="email" class="col-sm-2 control-label">Email : </label>
                    <div class="col-md-6">
                        <input type="email" required  name="email" class="form-control" id="email"
                        placeholder="example@example.com">
                    </div>
                </div>
                <div class="form-group">
                    <label for="password" class="col-md-2 control-label">Password : </label>
                    <div class="col-md-6">
                        <input type="password" required name="pass" class="form-control" id="password"
                        placeholder="Enter Password">
                    </div>
                </div>
                <div class="form-group">
                    <label for="contact" class="col-sm-2 control-label">Contact No. : </label>
                    <div class="col-md-6">
                        <input type="number" required  name="contact" class="form-control" id="contact"
                        placeholder="Enter Your Mobile No.">
                    </div>
                </div>
                 <div class="form-group">
                    <label for="contact" class="col-sm-2 control-label">Blood Group : </label>
                    <div class="col-md-6">
                        <input type="number" required  name="bg" class="form-control" id="BG"
                        placeholder="Enter Your Blood Group">
                    </div>
                </div>
                 <div class="form-group">
                    <label for="contact" class="col-sm-2 control-label">Location : </label>
                    <div class="col-md-6">
                        <input type="number" required  name="loc" class="form-control" id="LO"
                        placeholder="Enter Your Location.">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-md-6">
                        <button type="submit" name="submit" class="btn btn-info btn-md btn-block">Sign Up</button>
                    </div>
                </div>
            </form>
        </div>
</div>

</body>
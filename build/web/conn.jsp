<%-- 
    Document   : conn
    Created on : 25 Oct, 2015, 10:59:13 PM
    Author     : vasu jain
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Contact Us</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
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
<div class="container">
  <div class="row hvr-pulse-grow">
  <div class="col-sm-12  col-md-12 col-xs-12"><h1 style="color:black"><center style="padding-top:40px"><b>Let's Keep In Touch!</b></h1></center></div>

  <div class="col-sm-12  col-md-12 col-xs-12">
  <h4 style="color:black"><center style="position: relative;
    top: -10px;">Thank you for visiting out this Portal. If you would like to get into contact with Us, please fill out the form below.</center></h4></div>
   
</div>
<div class="row">
  <div class="col-sm-4 col-md-4 col-xs-12">
    <div style="padding-top:50px">
    <div class="col-xs-12">
        <label for="ex3"><b style="color:white">NAME:</b></label>
        <input class="form-control" id="focusedInput" type="text" placeholder="Enter Name">
      </div>
<div class="col-xs-12">
        <label for="ex3"><b style="color:white">EMAIL:</b></label>
        <input class="form-control" id="ex3" type="text" placeholder="Enter Email">
      </div>
  </div>
  </div>
  <div class="col-sm-4 col-md-4 col-xs-12">
  <div style="padding-top:40px">
     <label for="comment" style="color:white"><center><b>COMMENTS:</b></center></label>
  <textarea class="form-control" id="focusedInput" rows="5" placeholder="Enter Comments"></textarea>
   </div>
<div class="col-xs-12" style="padding-top:20px">
  <center><button type="button" class="btn btn-primary btn-default btn-lg  hvr-wobble-to-top-right">SUBMIT</button></center>
</div >
</div>
  <div class="col-sm-4 col-md-4 col-xs-12" style="padding-top:40px">
  <div>
      <h3 style="color:white"><center><b>Address:</b></center></h1>
      <h4 style="color:black"><center> Jaypee University
      of Engineering & Technology</center></h4>
      <h3 style="color:white"><center><b>Phone:</b></center></h1>
      <h4 style="color:black"><center>+91-9039259369</center></h4>

  </div> 
</div>
</div>    
</div>
  
</body>
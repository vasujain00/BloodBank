<%-- 
    Document   : indexx
    Created on : 25 Oct, 2015, 10:58:27 PM
    Author     : vasu jain
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Blood Donation</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="bootstrap/js/bootstrap.min.js"></script>
  <script src="js/jquery.js"></script>
     <script src="js/typed.js"></script>
      <script>
  $(function(){
      $(".element").typed({
        strings: ["Blood Bank Portal^1000", "Making Life Saving Easier^1000","Blood Bank Portal."],
        typeSpeed: 0
      });
  });
  $(function(){
        $(".el").typed({
            strings: ["^10000All Blood Groups.", "^1000At One Place","All Blood Groups At One Place."],
            typeSpeed:6
        });
    });
</script>
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
<center><bold><h1 class="element" style='color:orangered;'></h1></bold></center>
<center><bold><h1 class="el" style='color:orangered;'></h1></bold></center>
</div>

</body>
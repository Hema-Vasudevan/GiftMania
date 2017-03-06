<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link  href="<c:url value="/resources/font-awesome/css/font-awesome.min.css"/>" rel="stylesheet" type="text/css">
<link href="<c:url value="/resources/style.css"/>" rel="stylesheet" type="text/css">
<link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css">
<script src="<c:url value="/resources/jquery/jquery.min.js"/>" type="text/javascript"> </script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"  type="text/javascript"> </script> 
<style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 55%;
      height: 70%;
      margin: auto;
  }
  </style>
<title>Home | Products</title>
</head>
<body>
<div class="jumbotron row-md-1 text-center">
<h1> <a href="home">GiftMania</a> </h1>
</div>
<nav class="navbar navbar-default" role="navigation">
<div class="container-fluid">
<div class="navbar-header">
<div>
    <ul class="nav navbar-nav navbar-right">
	<i class="fa fa-facebook"></i>
	</ul>
<ul class="nav navbar-nav">
<li class="active"> <a href="home"> Home </a> </li>
<li> <a href="abt"> About Us </a> </li>
<li class="dropdown">
<a href="" name="prod" class="dropdown-toggle" data-toggle="dropdown">Products
<b class="caret"> </b> </a>
<ul class="dropdown-menu">
<li> <a href="product?prod=Men">  Men </a>  </li>
<li> <a href="product?prod=Women"> Women </a> </li>
<li> <a href="product?prod=Children"> Children </a> </li>
</ul>
</li>
 <li> <a href="sign"> Sign up</a> </li>
<li> <a href="login"> Login </a> </li>
</ul> 
</div>
</div>
</div>
</nav>
<div id="myCarousel" class="carousel slide" data-ride="carousel">
	<ol class="carousel-indicators">
	<li data-target="#myCarousel" data-slide-to="0" class="active"> </li>
	<li data-target="#myCarousel" data-slide-to="1"> </li>
	<li data-target="#myCarousel" data-slide-to="2"> </li>
	<li data-target="#myCarousel" data-slide-to="3"></li>
	</ol>
	<div class="carousel-inner" role="listbox">
			<div class="item active">
			<img src="<c:url value="/resources/img/1.jpg" />">
			</div>
			<div class="item">
			<img src="<c:url value="/resources/img/2.jpg" />">
			</div>
			<div class="item">
			<img src="<c:url value="/resources/img/3.jpg" />">
			</div>
			<div class="item">
			<img src="<c:url value="/resources/img/4.jpg" />">
			</div>
			</div>
<a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/style.css" />" rel="stylesheet" type="text/css">
<link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css">
<script src="<c:url value="/resources/jquery/jquery.min.js"/>" type="text/javascript"> </script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"  type="text/javascript"> </script> 
<style> 
#carousel-container 
{
width:1000px;
height:400px;
}
</style>
<title>Home | Products</title>
</head>
<body>
<div class="jumbotron text-center">
<h1> <a href="home.jsp">GiftMania</a> </h1>
</div>
<nav class="navbar navbar-default" role="navigation">
<div class="container-fluid">
<div class="navbar-header">
<div>
<ul class="nav navbar-nav">
<li class="active"> <a href="home.jsp"> Home </a> </li>
<li> <a href="abt.jsp"> About Us </a> </li>
<li class="dropdown">
<a class="dropdown-toggle" data-toggle="dropdown">Category 
<b class="caret"> </b> </a>
<ul class="dropdown-menu">
<li> <a href="ProductController.java"> Men </a> </li>
<li> <a href="ProductController.java"> Women</a> </li>
<li> <a href="ProductController.java"> Children </a> </li>
</ul>
</li>
 <li> <a href="sign.jsp"> Sign up</a> </li>
<li> <a href="login.jsp"> Login </a> </li> 
</ul> 
</div>
</div>
</div>
</nav>
<font color="black"> 
<form name="sign" method="post" action="/GiftMania/process">
<div class="container col-xs-4 col-xs-offset-1">
<div class="jumbotron">
 <div class="form-group">
<label for="user"> Product Id : </label>
<input type="text" class="form-control" name="pid" id='pid' required>
</div> <br>
<div class="form-group">
<label for="user"> Product Name : </label>
<input type="text" class="form-control" name="pname" id='pname' required>
</div> <br>
<div class="form-group">
<label for="user"> Product Description : </label>
<input type="text" class="form-control" name="pdesc" id='pdesc' required>
</div> <br>
<div class="form-group">
<label for="user"> Product Category : </label>
<input type="text" class="form-control" name="pcat" id='pcat' required>
</div> <br>
<div class="form-group">
<button type="submit" class="btn btn-default"> Add Product  </button> 
</div>
</div>
</div>
</form>
<form name="sign" method="post" action="/GiftMania/delete">
<div class="container col-xs-3 col-xs-offset-2">
<div class="jumbotron">
 <div class="form-group">
<label for="user"> Product Id : </label>
<input type="text" class="form-control" name="pid" id='pid' required>
</div> <br>
<div class="form-group">
<button type="submit" class="btn btn-default"> Remove Product  </button> 
</div>
</div>
</div>
</form>
<form name="sign" method="post" action="/GiftMania/update">
<div class="container col-xs-4 col-xs-offset-1">
<div class="jumbotron">
 <div class="form-group">
<label for="user"> Product Id : </label>
<input type="text" class="form-control" name="pid" id='pid' required>
</div> <br>
<div class="form-group">
<label for="user"> Product Name : </label>
<input type="text" class="form-control" name="pname" id='pname' required>
</div> <br>
<div class="form-group">
<label for="user"> Product Description : </label>
<input type="text" class="form-control" name="pdesc" id='pdesc' required>
</div> <br>
<div class="form-group">
<label for="user"> Product Category : </label>
<input type="text" class="form-control" name="pcat" id='pcat' required>
</div> <br>
<div class="form-group">
<button type="submit" class="btn btn-default"> Update Product  </button> 
</div>
</div>
</div>
</form>
</font>
</body>
</html>
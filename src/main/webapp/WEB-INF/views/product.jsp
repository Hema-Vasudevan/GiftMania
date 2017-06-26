<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/style.css"/>" rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css">
<script src="<c:url value="/resources/jquery/jquery.min.js"/>" type="text/javascript"> </script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"  type="text/javascript"> </script> 
<script src="<c:url value="/resources/js/angular.min.js"/>"  type="text/javascript"> </script> 
<style> 
#carousel-container 
{
width:1000px;
height:400px;
}
</style>
<script>
var x = ${prodlist};
angular.module('prod', []);
angular.module('prod').controller('MyCtrl',function ($scope){
$scope.productList = x;	
console.log($scope.productList);
});
</script>
<title>Home | Products</title>
</head>
<body ng-app="prod">
<div class="jumbotron text-center">
<h1> <a href="home">Gift Mania</a> </h1>
</div>
<nav class="navbar navbar-default" role="navigation">
<div class="container-fluid">
<div class="navbar-header">
<div>
<ul class="nav navbar-nav">
<li class="active"> <a href="home"> Home </a> </li>
<li> <a href="abt"> About Us </a> </li>
<li class="dropdown">
<a href="" name="prod" class="dropdown-toggle" data-toggle="dropdown">Category 
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
<div class="col-md-9" ng-controller="MyCtrl">
<h2>
${prodname}
</h2>
<div class="thumbnail" ng-repeat="prod in productList">
<h3>{{prod.pname}}</h3>
<p>{{prod.prod_desc}}</p>
</div>
</div>
<%-- <h1>  ${prodname}</h1> --%>
<%-- <c:forEach var="listValue" items="${list3}"> --%>
<%-- ${listValue.pid} --%>
<%-- ${listValue.pname} --%>
<%-- ${listValue.prod_desc} --%>
<%-- </c:forEach> --%>
</body>
</html>
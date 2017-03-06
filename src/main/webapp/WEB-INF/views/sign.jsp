<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <html>
<head>
<title> Home | Products </title>
<link href="<c:url value="/resources/style.css"/>" rel="stylesheet" type="text/css">
<link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css">
<script src="<c:url value="/resources/jquery/jquery.min.js"/>" type="text/javascript"> </script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"  type="text/javascript"> </script> 
<script type="text/javascript">
function formValidator()
{
var firstname=document.getElementById('fname');
var lastname=document.getElementById('lname');
var addr=document.getElementById('addr');
var zip=document.getElementById('pin');
var Countries=document.getElementById('country');
var username=document.getElementById('uname');
var email=document.getElementById('emailid');
var dd=document.getElementById('dd');
var mm=document.getElementById('mm');
var yyyy=document.getElementById('yr');
var password=document.getElementById('pwd');
if(isAlphabet(fname,"Please enter only letters for your First name"))
{
if(isAlphabet(lname,"Please enter only letters for your Last name"))
{
if(madeSelection(dd,"Please Choose a date "))
{
if(madeSelection(mm,"Please Choose a month"))
{
if(madeSelection(yr,"Please Choose a year"))
{
if(isAlphanumeric(addr,"Enter Numbers and letters only for address"))
{
if(isNumeric(pin,"Please enter a valid zip code"))
{
if(isAlphabet(country,"Please enter only letters for country"))
{
if(isAlphabet(city,"Please enter only letters for city"))
{
if(lengthRestriction(uname,6,8))
{
if(isAlphanumeric(pwd,"Enter Numbers and letters only for password"))
{
if(emailValidator(emailid,"Please enter a valid email address"))
{
alert("Successful Entry!!");
return true;
}}}}}}}}}}}}
return false;
}
function notEmpty(elem,helperMsg)
{
if(elem.value.length==0)
{
alert(helperMsg);
elem.focus();
return false;
}
return true;
}
function isNumeric(elem,helperMsg)
{
var numericExpression=/^[0-9]+$/;
if(elem.value.match(numericExpression))
{
return true;
}
else
{
alert(helperMsg);
elem.focus();
return false;
}
}
function isAlphabet(elem,helperMsg)
{
var alphaExp=/^[a-zA-Z]+$/;
if(elem.value.match(alphaExp))
{
return true;
}
else
{
alert(helperMsg);
elem.focus();
return false;
}
}
function isAlphanumeric(elem,helperMsg)
{
var alphaExp=/^[0-9, a-z a-z, 0-9, A-Z A-Z, - 0-9 . ]+$/;
if(elem.value.match(alphaExp))
{
return true;
}
else
{
alert(helperMsg);
elem.focus();
return false;
}
}
function lengthRestriction(elem,min,max)
{
var unput=elem.value;
if(unput.length>=min&&unput.length<=max)
{
return true;
}
else
{
alert("Please enter username between "+min+" and "+max+" charactters");
elem.focus();
return false;
}
}
function madeSelection(elem,helperMsg)
{
if(elem.value=="Please Choose")
{
alert(helperMsg);
elem.focus();
return false;
}
else
{
return true;
}
}
function emailValidator(elem,helperMsg)
{
var emailExp=/^[0-9 a-z . a-z 0-9]+\@[a-z]+\.[a-z]{2,4}$/;
if(elem.value.match(emailExp))
{
return true;
}
else
{ alert(helperMsg);
elem.focus();
return false;}
}
</script>
</head>
<body> 
<div class="jumbotron text-center">
<h1> <a href="home">GiftMania</a> </h1>
</div>
<nav class="navbar navbar-default" role="navigation">
<div class="container-fluid">
<div class="navbar-header">
<div>
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
<font color="black"> 
<form name="sign" method="post" onsubmit="return formValidator()" action="/GiftMania/welcome">
<div class="container col-xs-5 col-xs-offset-4">
<div class="jumbotron">
 <div class="form-group">
<label for="user"> First Name : </label>
<input type="text" class="form-control" name="fname" id='fname' required>
</div> <br>
<div class="form-group">
<label for="user"> Last Name: </label>
<input type="text" class="form-control" name="lname" id='lname' required>
</div> <br>
<div class="form-group">
<label for="user"> Date Of Birth : </label> <br>
<select id='dd' name="dd" required>
<option value="Please Choose">Please choose</option>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option>
<option value="11">11</option>
<option value="12">12</option>
<option value="13">13</option>
<option value="14">14</option>
<option value="15">15</option>
<option value="16">16 </option>
<option value="17">17</option>
<option value="18">18</option>
<option value="19">19</option>
<option value="20">20</option>
<option value="21">21</option>
<option value="22">22</option>
<option value="23">23</option>
<option value="24">24</option>
<option value="25">25</option>
<option value="26">26</option>
<option value="27">27</option>
<option value="28">28</option>
<option value="29">29</option>
<option value="30">30</option>
<option value="31">31</option>
</select>
<select id='mm' name="mm">
<option value="Please Choose">Please choose</option>
<option value="Jan">Jan</option>
<option value="Feb">Feb</option>
<option value="Mar">Mar</option>
<option value="Apr">Apr</option>
<option value="May">May</option>
<option value="Jun">Jun</option>
<option value="Jul">Jul</option>
<option value="Aug">Aug</option>
<option value="Sep">Sep</option>
<option value="Oct">Oct</option>
<option value="Nov">Nov</option>
<option value="Dec">Dec</option>
</select>
<select id='yr' name="yr">
<option value="Please Choose">Please choose</option>
<option value="1990">1990-1997</option>
<option value="1980">1980-1989</option>
<option value="1970">1970-1979</option>
<option value="1960">1960-1969</option>
<option value="1950">1950-1959</option>
<option value="1940">1940-1949</option>
<option value="1930">1930-1939</option>
</select> 
</div><br>
<div class="form-group">
<label for="user"> Gender : </label>
<input type="radio"  name="gender" id='gender' value="Male" required> Male
<input type="radio"  name="gender" id='gender' value="female" checked> Female 
</div> <br>
<div class="form-group">
<label for="user"> Nationality : </label>
<input type="radio"  name="nationality" id='nationality' value="Indian" required checked> Indian
<input type="radio"  name="nationality" id='nationality' value="Others"> Others
</div> <br>
<div class="form-group">
<label for="user"> Country : </label>
<input type="text" class="form-control" name="country" id='country' required>
</div> <br>
<div class="form-group">
<label for="user"> City : </label>
<input type="text" class="form-control" name="city" id='city' required>
</div> <br>
<div class="form-group">
<label for="user"> Address: </label>
<input type="text" class="form-control" name="addr" id='addr' required>
</div> <br>
<div class="form-group">
<label for="user"> Pincode: </label>
<input type="text" class="form-control" name="pin" id='pin' required>
</div> <br>
<div class="form-group">
<label for="user"> Email-id : </label>
<input type="text" class="form-control" name="emailid" id='emailid' required>
</div> <br>
<div class="form-group">
<label for="user"> Username: </label>
<input type="text" class="form-control" name="usrname" id='uname' required>
</div> <br>
<div class="form-group">
<label for="user"> Password: </label>
<input type="password" class="form-control" name="passwd" id='pwd' required>
</div> <br>
<input type="checkbox" checked required> I agree to the terms and conditions <br> <br>
<div class="form-group">
<button type="submit" class="btn btn-default"> Submit   </button> <br> <br>
</div>
</div>
</div>
</form>
</font>
</body>
</html>
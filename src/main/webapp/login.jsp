<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> --%>
<%@ page language="java"  contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<style>
form{
background-color:skyblue;
width:250px;
height:200px;
border-style:solid;
border-color:blue;
padding:10px;
}
</style>
</head>
<body>
<h2>Please enter valid username and password</h2>
<div>
<form action="/login" method="post">
<c:if test="${not empty error}">
<div style="color:red;"><h3>${error}</h3></div>
<div><br></div>

</c:if>
<div>UserName: <input type="text" name="lusername" value=""></div>
<div><br></div>
<div>Password: <input type="password" name="lpassword" value=""></div>
<div><br></div>
<div><input type="submit" value="Login" style="background-color:lime;"></div>
<div><br></div>
</form>
</div>

</body>
</html>
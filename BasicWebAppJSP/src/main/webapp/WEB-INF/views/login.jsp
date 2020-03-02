<%@ page import ="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Guru84</title>
</head>
<body>
<form action="/login.do" method="post">
Enter Your Name <input type="text" name="username" /> <input type = "password" name="password"/>
<input type="submit" value="Login" /> 
<p><font color ="red">${errorMessage}</font></p>
</form>
</body>
</html>
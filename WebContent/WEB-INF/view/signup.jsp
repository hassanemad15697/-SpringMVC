<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
</head>
<body>
	<h1>Sign Up</h1>
	<form action="signupNewUser">
		Name: <input type="text" placeholder="name" name="name">
		Email: <input type="text" placeholder="email" name="email">
		Password: <input type="password" placeholder="password" name="password">
		Age: <input type="text" placeholder="age" name="age"> 
		<input type="submit" value="Sign Up">
	</form>
</body>
</html>
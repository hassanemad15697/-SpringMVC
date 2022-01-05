<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${signUpData.name}</h1>
	<h1>${signUpData.email}</h1>
	<h1>${signUpData.password}</h1>
	<h1>${signUpData.age}</h1>
	<h1>${signUpData.phone}</h1>
	<h1>${signUpData.department}</h1>
	<h1>${signUpData.language}</h1>
	<h1>
		<c:forEach var="player" items="${signUpData.players}">${player}</c:forEach>
	</h1>
</body>
</html>
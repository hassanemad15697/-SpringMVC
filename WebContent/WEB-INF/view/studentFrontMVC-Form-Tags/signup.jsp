<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up MVC Tags</title>
</head>
<body>
	<h1>Sign Up MVC Tags</h1>
	<f:form modelAttribute="signUpData"  action="signupNewUserMVCTags">
		Name: <f:input path="Name" /><br>
		Email: <f:input path="Email" /><br>
		Password: <f:input path="Password" /><br>
		Age: <f:input path="Age" /><br>
		<input type="submit" value="Sign Up">
	</f:form>

</body>
</html>
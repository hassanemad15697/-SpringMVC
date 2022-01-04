<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up MVC Tags</title>
<style type="text/css">
.error {
	color: red;
	font-weight: bold;
}
</style>
</head>
<body>
	<h1>Sign Up MVC Tags</h1>
	<f:form modelAttribute="signUpData" action="signupNewUserMVCTags">
		Name: <f:input path="Name" />
		<f:errors path="Name" cssClass="error" />
		<br>
		Email: <f:input path="Email" />
		<f:errors path="Email" cssClass="error" />
		<br>
		Password: <f:password path="Password" />
		<f:errors path="Password" cssClass="error" />
		<br>
		Age: <f:input path="Age" />
		<f:errors path="Age" cssClass="error" />
		<br>
		<f:select path="Department">
			<f:options items="${signUpData.departmentOptions}" />
		</f:select>
		<f:errors path="Department" cssClass="error" />
		<br>
		Choose a Programming Language :
		<f:radiobutton path="Language" value="Java" />Java
		<f:radiobutton path="Language" value="C++" />C++
		<f:radiobutton path="Language" value="C#" />C#
		<f:radiobutton path="Language" value="Go" />Go
		<f:errors path="Language" cssClass="error" />
		<br>
		<f:checkbox path="Players" value="Salah" />Salah
		<f:checkbox path="Players" value="Messi" />Messi
		<f:checkbox path="Players" value="CR7" />CR7
		<f:errors path="Players" cssClass="error" />
		<br>
		<input type="submit" value="Sign Up">
	</f:form>

</body>
</html>
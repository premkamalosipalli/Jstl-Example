<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Credentials</title>
</head>
<body>
<h1 align="center">LOGIN WITH CREDENTIALS</h1>
	<form action="jstlDemo" method="post">
		<div align="center">
			<table>
			<tr>
				<td>Enter Your Name:</td>
				<td> <input type="text" name="username" size="20"></td>
			</tr>
			<tr>
				<td> Enter Your Password:</td>
				<td><input type="password" name="password" size="20"></td>
			</tr>
			</table>
		    <input type="submit" value="LOGIN" />
		 </div>
	</form>
</body>
</html>
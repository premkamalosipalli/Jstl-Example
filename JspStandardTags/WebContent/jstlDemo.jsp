<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	<c:out value="Welcome to Jstl"></c:out><br>
		<c:out default="default" value="${name}" escapeXml="true"></c:out><br>
		<c:out default="default" value="${password}" escapeXml="true"></c:out><br>
		<strong> Movie list:</strong>
		<br>
		<table>
			<c:forEach var="movie" items="${movieList}" >
				<tr>
					<td>${movie}</td>
				</tr>
			</c:forEach>
		</table>
		<c:if test="${name eq 'prem'}">
		User Login Successfull
		</c:if>
		<c:choose>
			<c:when test="${name eq 'prem' }">The User Name is Prem</c:when>
			<c:otherwise><form action="jstlSample.jsp" method="post">
			User Login Not Successfull<br>
			Add a New User:<br>
			<input type="text" name="newuser"/>
			<input type="submit" value="Add User"/>
			</form></c:otherwise>
		</c:choose>
		<c:set var="userstatus" scope="request" value="NEWUSER"/>
		<br>new User name:${userstatus}	
	</div>
	<c:import url="http://www.google.com" />
</body>
</html>
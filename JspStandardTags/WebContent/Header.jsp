<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="mytag" tagdir="/WEB-INF/tags"%>
<%@taglib prefix="mytags" uri="simpleTags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<mytag:Header fontColor="#660099"> Hi Every One this is a sample tag that can identify the need of a tag</mytag:Header>
	<br> Welcome to Our Site.
	<br>
	<mytags:simple1>Simple body for a custom tag handler</mytags:simple1>
	<br>
	<mytags:simple1>${message}</mytags:simple1>
	<br>
	<mytags:Menu>
		<mytags:MenuItem itemValue="cats"></mytags:MenuItem>
		<mytags:MenuItem itemValue="dogs"></mytags:MenuItem>
	</mytags:Menu>
</body>
</html>
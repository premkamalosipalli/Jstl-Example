<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ tag body-content="tagdependent" %>
<%@ attribute name="fontColor" required="true" rtexprvalue="true" %>

<img src="C:\Users\bluesky\Pictures\Saved Pictures\index.png">
<em><strong><font color="${fontColor}"><jsp:doBody></jsp:doBody></font></strong></em>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String userName=request.getParameter("name");
pageContext.setAttribute("pageContextUserName", userName);
if(userName!=null){
	session.setAttribute("sessionUserName", userName);
	application.setAttribute("applicationUserName", userName);
}

%>

<br>
The user name in the request object is: <%=userName%>
<br>
The name in session object is: <%=session.getAttribute("sessionUserName") %>
<br>
the name in the application is <%=application.getAttribute("applicationUserName") %>
<br>
the name in pageContext is <%=pageContext.getAttribute("pageContextUserName") %>
</body>
</html>
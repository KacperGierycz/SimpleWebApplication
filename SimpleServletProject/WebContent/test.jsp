<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>Testing Jsp</h3>

<%!
public int add (int a, int b){
return a+b;

}
%>

<%
int i=1;
int j=2;
int k;

k=i+j;

out.println("Value of k is: " + k);

%>

The value of k is: <%=k %>


<%
k=add(3323, 3444);

%>

The value of k is: <%=k %>

<%

for(int l=0;l<5;l++){
%>	
<!-- 
	out.println("<br>"+ "l="+ l);
 -->
<br> l= <%=l %>


<% }%>


</body>
</html>




















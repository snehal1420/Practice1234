<%@page import="com.spboot.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% User c1=(User)request.getAttribute("user"); %>
<form action="up" style="text-align: center;font-family: monospace;">
<pre>
<h2 style="color: blue">Edit User Data</h2>
Id : <input type="readonly" name="id" value="<%=c1.getId()%>"><br><br>
Name : <input type="text" name="name" value="<%=c1.getName()%>"><br><br>
Address : <input type="text" name="address" value="<%=c1.getAddress()%>"><br><br>
Username : <input type="text" name="uname" value="<%=c1.getUname()%>"><br><br>
Password : <input type="text" name="pass" value="<%=c1.getPass()%>"><br><br>
<input type="submit" value="Update">
</pre>
</form>
</body>
</html>
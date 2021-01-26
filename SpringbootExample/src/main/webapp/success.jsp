<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
   function editData() {
	 
	alert("Call Edit with Id binding is");
	document.myform.action="edit";
	document.myform.submit();
}
   function deleteData() {
	   alert("Call delete with Id binding  is");
		document.myform.action="delete";
		document.myform.submit();
	}
	   
   function addData() {
		alert("Call Add");
		document.myform.action="reg";
		document.myform.submit();
	}
	   
   function deleteAllData() {
	   document.myform.action="del";
		document.myform.submit();
}
   
</script>

<body>

<form name="myform">

  <table border="3">
     <thead>
     <tr>
        <th>Select</th>
         <th>Id</th>
          <th>Name</th>
           <th>Address</th>
            <th>Username</th>
             <th>Passwprd</th>
             </tr>
     </thead>
     <tbody>
        <c:forEach items="${data}" var="client">
        <tr>
  <td><input type="radio" id="id" name="id" value="<c:out value="${client.id}"></c:out>"></td>
        <td><c:out value="${client.id}"></c:out></td>
         <td><c:out value="${client.name}"></c:out></td>
          <td><c:out value="${client.address}"></c:out></td>
           <td><c:out value="${client.uname}"></c:out></td>
            <td><c:out value="${client.pass}"></c:out></td>
             </tr>
        </c:forEach>
     </tbody>
  
  </table>
    <br>
 
     <input type="button" value="Edit" onclick="editData()"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="button" value="Delete" onclick="deleteData()">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="button" value="Add" onclick="addData()">
<input type="button" value="DelAll" onclick="deleteAllData()">
</form>



</body>
</html>
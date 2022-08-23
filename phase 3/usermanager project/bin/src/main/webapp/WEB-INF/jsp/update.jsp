<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<style>
	table, th, td {
	  border: 1px solid black;
	  	  margin: auto;
	  
	}
	.center {
 		text-align: center;
 	}
	</style>
</head>
<body style="background-color:lightblue;">
	<div class="center">
		<h2>Update Table</h2>
		
		<p> User ID: ${ID}</p>
		<table style="float:inherit">
		   <tr><th>ID</th><th>Name</th><th>Email</th><th>Password</th></tr>
		   <c:forEach items="${user}" var="userE" varStatus="count">
		    <tr id="${count.index}">
		    	<td>${userE.id}</td>
		        <td>${userE.name}</td>
		        <td>${userE.email}</td>
		        <td>${userE.password}</td>
		    </tr>
			</c:forEach>
		</table>
		<br><br>
		<form method="post" action="update2">
			<br><h3>Edit user: ${ID}</h3>
			<input type="text" id="nameedit" name="nameedit" placeholder="Name" required>
			<input type="text" id="emailedit" name="emailedit" placeholder="Email" required>
			<input type="text" id="passwordedit" name="passwordedit" placeholder="Password" required>	
			<input type="submit" value="Enter" />
		</form>
	</div>
</body>
</html>
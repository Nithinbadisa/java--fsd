<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
h1>Add Booking information</h1>
<form action="UpdateBooking" method="post">
		<table>
			
			<tr>
				<td>Enter the flight number to book flights:</td>
				<td><input name="cfno" type="text"  /></td>
			</tr>			
			<tr>
				<td>Enter Name:</td>
				<td><input name="username" type="text" /></td>
			</tr>
			<tr>
				<td>Enter aadhar number:</td>
				<td><input name="userid" type="text" /></td>
			</tr>
			<tr>
				<td>Enter number of people traveling:</td>
				<td><input name="npeople" type="text" /></td>
			</tr>
			<tr>
				<td>Enter date of travel:</td>
				<td><input name="tdate" type="text" />
				</td>
				<td><p style="font-size:10px;">date formate "yyyy-mm-dd" only</p></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Submit"/></td>
			</tr>
		</table>
		
		<p><a href="index.html">Home</a></p>
	</form>

</body>
</html>
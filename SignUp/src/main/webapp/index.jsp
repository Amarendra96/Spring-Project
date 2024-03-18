<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="signUpUser">
		<table>
			<tr>
				<td><label>Enter ID:</label></td>
				<td><input type="number" placeholder="User ID" name="userId"></td>
			</tr>
			<tr>
				<td><label>Enter Name:</label></td>
				<td><input type="text" placeholder="User Name" name="userName"></td>
			</tr>
			<tr>
				<td><label>Enter Password:</label></td>
				<td><input type="text" placeholder="User Password" minlength="8" name="userPassword"></td>
			</tr>
			<tr>
				<td><label>Confirm Password:</label></td>
				<td><input type="text" placeholder="Confirm Password" name="userConfirmPassword"></td>
			</tr>
			<tr>
				<td><label>Enter Email:</label></td>
				<td><input type="email" placeholder="User Email" name="userEmail"></td>
			</tr>
		</table>
		<input type="submit" value="SIGNUP">
	</form>

</body>
</html>
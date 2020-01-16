<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>hi</h1>

<form action="validateUser" method="post">
		<table>

			<tr>
				<td>email</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>password</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td>ROLE:</td>
				<td><input type="radio" name="role" value="company" checked="checked">Company</td>
				<td><input type="radio" name="role" value="job seeker">Job
					Seeker</td>
			</tr>

			<tr>
				<td><input type="submit" value="login"></td>
			</tr>
			
			<tr>
				<td>want to register? <a href="toregisterUser">click here!</a></td>
			</tr>
		</table>
	</form>

</body>
</html>
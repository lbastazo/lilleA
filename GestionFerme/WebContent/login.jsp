<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form action="login" method="POST">
	<div>
		<label>Login</label> <input type="text" name="Login"
			placeholder="Nom d'utilisateur...">
	</div>

	<div>
		<label> Password </label> <input type="password" name="password"
			placeholder="Mot de Passe ...">
	</div>

	<!-- <h4 style="color: red; text-align: center">${msg}</h4> -->

	<div>
		<input type="submit" value="Se connecter !!!">
	</div>

	<div>
		<a href="register.jsp">Créer votre compte</a>
	</div>
	</form>

</body>
</html>
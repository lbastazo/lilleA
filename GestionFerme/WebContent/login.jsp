<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Connexion</title>
</head>
<body>
	<H1>Se connecter</H1>
	<form action="accueil.jsp" method="POST">
	
	<div>
		<label>Identifiant</label> <input type="text" name="login"
			placeholder="Identifiant...">
	</div>

	<div>
		<label>Mot de passe</label> <input type="password" name="password"
			placeholder="Mot de Passe ...">
	</div>

	<h4 style="color: red; text-align: center">${msg}</h4> 

	<div>
		<input type="submit" value="S'identifier">
	</div>

	<div>
		<a href="register.jsp">Créer votre compte</a>
	</div>
	</form>

</body>
</html>
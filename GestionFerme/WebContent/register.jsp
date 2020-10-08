<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>

<form action="register" method="POST"> </form>
<span>Créer votre compte</span>

	<div>
	<label>Nom : </label>
	<input type="text" name="nom">
	</div>
	
	<div>
		<label>Prénom :	</label>
	<input type="text" name="prenom">
	</div>
	
	<div>
		<label>Date de naissance : </label>
	<input type="text" name="dateN"></div>
	
	<div>
		<label>Identifiant : </label>
	<input type="text" name="Login"></div>
	
	<div>
		<label>Mot de passe :</label>
	<input type="password" name="password"></div>
	
	<div>
		<label></label>
	<input type="submit" name=""></div>
	
</body>
</html>
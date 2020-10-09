<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>accueil</title>
</head>
<body>
<H1>Gestion Ferme</H1>
<% 
String nom = request.getParameter("nom"); 
%> 
<H2>Bonjour <%= nom %></H2> 
</body>
</html>
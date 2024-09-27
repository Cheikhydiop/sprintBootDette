<%@page import="web.CreditMetier"%>
<%@ page  pageEncoding="UTF-8"%>
<%
CreditMetier model= (CreditMetier)request.getAttribute("result");
%>

<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulaire de Contact</title>
</head>
<body>
    <h1>Banque</h1>
    <form action="calculerMensualite.do" method="POST">
        <label for="name">Motant:</label>
        <input type="text" id="name" name="montant"  >
        <br><br>
         <label for="name">Taux:</label>
        <input type="text" id="name" name="taux" >
        <br><br>
         <label for="name">Duree:</label>
        <input type="text" id="name" name="duree"  >
        <br><br>
       
        <button type="submit">Calculer</button>
    </form>
    <div>
    <% out.println(model.getMensualite()); %>
    </div>
</body>
</html>

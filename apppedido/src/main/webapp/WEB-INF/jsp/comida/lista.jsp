<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Comidas</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
	  <h3>Comidas: ${listagem.size()}</h3>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Nome</th>
	        <th>Valor</th>
	        <th>Código</th>
	        <th>Peso</th>
	        <th>Vegano</th>
	        <th>Ingredientes</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
		  <c:forEach var="c" items="${listagem}">
		      <tr>
				<td>${c.id}</td>
		        <td>${c.nome}</td>
		        <td>${c.valor}</td>
		        <td>${c.codigo}</td>
		        <td>${c.peso}</td>
		        <td>${c.vegano}</td>
		        <td>${c.ingredientes}</td>
		        <td><a href="/comida/${c.id}/excluir">excluir</a></td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>
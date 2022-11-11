<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Bebidas</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
	  <h3>Bebidas: ${listagem.size()}</h3>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Nome</th>
	        <th>Valor</th>
	        <th>C�digo</th>
	        <th>Gelada</th>
	        <th>Tamanho</th>
	        <th>Marca</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
		  <c:forEach var="b" items="${listagem}">
		      <tr>
				<td>${b.id}</td>
		        <td>${b.nome}</td>
		        <td>${b.valor}</td>
		        <td>${b.codigo}</td>
		        <td>${b.gelada}</td>
		        <td>${b.tamanho}</td>
		        <td>${b.marca}</td>
		        <td><a href="/bebida/${b.id}/excluir">excluir</a></td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Loca��es</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
		<h2>Loca��es</h2>
		<h4><a href="/locacao">Nova Loca��o</a></h4>
		<p>Listagem de loca��es realizadas</p>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Descri��o</th>
					<th>Data de Loca��o</th>
					<th>Web?</th>
					<th>Cliente</th>
					<th>Materiais</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="b" items="${listagem}">
				<tr>
					<td>${b.id}</td>
					<td>${b.descricao}</td>
					<td>${b.dataLocacao}</td>
					<td>${b.web}</td>
					<td>${b.cliente.nome}</td>
					<td>${b.materiais}</td>
					<td><a href="/locacao/${b.id}/excluir">Excluir</a>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>
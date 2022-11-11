<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Locações</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
		<h2>Locações</h2>
		<h4><a href="/locacao">Nova Locação</a></h4>
		<p>Listagem de locações realizadas</p>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Descrição</th>
					<th>Data de Locação</th>
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
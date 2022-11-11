<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Materiais</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
		<h2>Materiais</h2>
		<h4><a href="/material">Novo Material</a></h4>
		<p>Listagem de materiais cadastrados</p>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Tipo</th>
					<th>Nome</th>
					<th>Descrição</th>
					<th>Valor</th>
					<th>Data de Publicação</th>
					<th>Usuário</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="b" items="${listagem}">
				<tr>
					<td>${b.id}</td>
					<td>${b.tipoMaterial}</td>
					<td>${b.nome}</td>
					<td>${b.descricao}</td>
					<td>${b.valor}</td>
					<td>${b.dataPublicacao}</td>
					<td>${b.usuario.nome}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>
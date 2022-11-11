<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Mídias</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
		<h2>Mídias</h2>
		<h4><a href="/midia">Nova Midia</a></h4>
		<p>Listagem de mídias cadastradas</p>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>Descrição</th>
					<th>Valor</th>
					<th>Data de Publicação</th>
					<th>Tipo</th>
					<th>Raro?</th>
					<th>Fabricante</th>
					<th>Ano de Fabricação</th>
					<th>Usuário</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="b" items="${listagem}">
				<tr>
					<td>${b.id}</td>
					<td>${b.nome}</td>
					<td>${b.descricao}</td>
					<td>${b.valor}</td>
					<td>${b.dataPublicacao}</td>
					<td>${b.tipo}</td>
					<td>${b.raro}</td>
					<td>${b.fabricante}</td>
					<td>${b.anoFabricacao}</td>
					<td>${b.usuario.nome}</td>
					<td><a href="/midia/${b.id}/excluir">Excluir</a>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>
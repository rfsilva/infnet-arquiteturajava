<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Periódicos</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
		<h2>Periódicos</h2>
		<h4><a href="/periodico">Novo Periódico</a></h4>
		<p>Listagem de periódicos cadastrados</p>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>Descrição</th>
					<th>Valor</th>
					<th>Data de Publicação</th>
					<th>Editora</th>
					<th>Abrangência</th>
					<th>Nro. Páginas</th>
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
					<td>${b.editora}</td>
					<td>${b.abrangencia}</td>
					<td>${b.totalPaginas}</td>
					<td>${b.usuario.nome}</td>
					<td><a href="/periodico/${b.id}/excluir">Excluir</a>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>
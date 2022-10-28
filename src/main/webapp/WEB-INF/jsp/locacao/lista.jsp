<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastramento de Locações</title>
</head>
<body>

	<nav class="navbar navbar-expand-sm bg-primary navbar-dark">
		<div class="container-fluid">
			<ul class="navbar-nav">
				<li class="nav-item">
					<a class="nav-link" href="/locacao/lista">Locação</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="/cliente/lista">Cliente</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="/material/lista">Material</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="/livro/lista">Livro</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="/periodico/lista">Periódico</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="/midia/lista">Mídia</a>
				</li>
			</ul>
		</div>
	</nav>

	<div class="container mt-3">
		<h2>Locações</h2>
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
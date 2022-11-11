<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Livros</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
		<h2>Cadastro</h2>
		<form action="/livro/incluir" method="post">
			<c:import url="/WEB-INF/jsp/material/camposcadastro.jsp"/>
			<div class="form-group">
				<label for="autor">Autor:</label>
				<input type="text" class="form-control" id="autor" placeholder="Entre com o autor" name="autor">
			</div>
			<div class="form-group">
				<label for="totalPaginas">Número de Páginas:</label>
				<input type="text" class="form-control" id="totalPaginas" placeholder="Entre com o número de páginas" name="totalPaginas">
			</div>
			<div class="form-group">
				<label for="editora">Editora:</label>
				<input type="text" class="form-control" id="editora" placeholder="Entre com a editora" name="editora">
			</div>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>

</body>
</html>
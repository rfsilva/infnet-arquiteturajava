<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Pedidos</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
		<h2>Cadastro</h2>
		<form action="/locacao/incluir" method="post">
			<div class="form-group">
				<label for="descricao">Descrição:</label>
				<input type="text" class="form-control" id="descricao" placeholder="Entre com a descrição" name="descricao">
			</div>
			<div class="form-group">
				<label for="data">Data:</label>
				<input type="datetime-local" class="form-control" id="data" placeholder="Entre com a data" name="data">
			</div>
			<div class="form-group">
				<label for="web">Tipo</label>
				<div class="form-check">
					<input type="radio" class="form-check-input" name="web" value="true">Web
					<label class="form-check-local"></label>
				</div>
				<div class="form-check">
					<input type="radio" class="form-check-input" name="web" value="false">Loja
					<label class="form-check-local"></label>
				</div>
			</div>
			<div class="form-group">
				<label>Cliente:</label>
				<select name="cliente" class="form-select">
					<c:forEach var="c" items="${clientes}">
						<option value="${c.id}">${c.nome}</option>
					</c:forEach>
				</select>
			</div>
			<div class="form-group">
				<label>Materiais:</label>
				<c:forEach var="m" items="${materiais}">
					<input class="form-check-input" type="checkbox" name="materiais" value="${m.id}">
					<label class="form-check-label">${m.nome}</label>
				</c:forEach>
			</div>

			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>

</body>
</html>
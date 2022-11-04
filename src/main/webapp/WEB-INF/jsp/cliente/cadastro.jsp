<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Clientes</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
		<h2>Cadastro</h2>
		<form action="/cliente/incluir" method="post">
			<div class="mb-3 mt-3">
				<label for="nome">Nome:</label> <input type="text" class="form-control" id="nome" placeholder="Entre com o nome" name="nome">
			</div>
			<div class="mb-3">
				<label for="cpf">CPF:</label> <input type="text" class="form-control" id="cpf" placeholder="Entre com o CPF" name="cpf">
			</div>
			<div class="mb-3 mt-3">
				<label for="email">Email:</label> <input type="text" class="form-control" id="email" placeholder="Entre com o e-mail" name="email">
			</div>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>

</body>
</html>
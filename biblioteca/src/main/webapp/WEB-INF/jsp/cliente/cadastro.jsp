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
			<div class="form-group">
				<label for="nome">Nome:</label>
				<input type="text" class="form-control" id="nome" placeholder="Entre com o nome" name="nome">
			</div>
			<div class="form-group">
				<label for="cpf">CPF:</label>
				<input type="text" class="form-control" id="cpf" placeholder="Entre com o CPF (sem máscara)" maxlength="11" name="cpf">
			</div>
			<div class="form-group">
				<label for="email">E-mail:</label>
				<input type="text" class="form-control" id="email" placeholder="Entre com o e-mail" name="email">
			</div>
			<div class="form-group">
				<label for="dataNascimento">Data de Nascimento (DD/MM/AAAA):</label>
				<input type="text" class="form-control" id="dataNascimento" placeholder="Entre com a data de nascimento (DD/MM/YYYY)" name="dataNascimento">
			</div>
			<div class="form-group">
				<label for="endereco">Endereço:</label>
				<input type="text" class="form-control" id="endereco" placeholder="Entre com o endereço" name="endereco">
			</div>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>

</body>
</html>
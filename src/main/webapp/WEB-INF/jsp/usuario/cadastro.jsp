<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Usuários</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
		<form action="/cep" class="form-inline" method="post">
			<div class="form-group">
				<label for="cep">CEP:</label>
				<input type="text" class="form-control" id="cep" placeholder="Informe o seu CEP" name="cep">
			</div>
			<button type="submit" class="btn btn-default">Buscar</button>
		</form>

		<h2>Cadastro</h2>
		<form action="/usuario/incluir" method="post">
			<div class="form-group">
				<label for="nome">Nome:</label>
				<input type="text" class="form-control" id="nome" placeholder="Entre com o nome" name="nome">
			</div>
			<div class="form-group">
				<label for="email">Email:</label>
				<input type="text" class="form-control" id="email" placeholder="Entre com o e-mail" name="email">
			</div>
			<div class="form-group">
				<label for="senha">Senha:</label>
				<input type="password" class="form-control" id="senha" placeholder="Entre com a senha" name="senha">
			</div>
			<c:import url="/WEB-INF/jsp/endereco.jsp"/>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>

</body>
</html>
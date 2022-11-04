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
		<h2>Cadastro</h2>
		<form action="/midia/incluir" method="post">
			<div class="form-group">
				<label for="tipo">Tipo:</label>
				<input type="text" class="form-control" id="tipo" placeholder="Entre com o tipo" name="tipo">
			</div>
			<div class="form-group">
				<label for="raro">Raro?</label>
				<input type="checkbox" class="form-control" id="raro" name="raro">
			</div>
			<div class="form-group">
				<label for="fabricante">Fabricante:</label>
				<input type="text" class="form-control" id="fabricante" placeholder="Entre com o fabricante" name="fabricante">
			</div>
			<div class="form-group">
				<label for="anoFabricacao">Ano de Fabricação:</label>
				<input type="text" class="form-control" id="anoFabricacao" placeholder="Entre com o ano de fabricação" name="anoFabricacao">
			</div>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>

</body>
</html>
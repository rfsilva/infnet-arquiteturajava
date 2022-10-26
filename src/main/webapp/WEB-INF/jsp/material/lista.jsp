<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastramento de Materiais</title>
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
		<h3>Materiais: ${listagem}</h3>
		<h3>${listagem.size()}</h3>
	</div>

</body>
</html>
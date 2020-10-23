<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculatrice</title>

<link type="text/css" rel="stylesheet" href="./asset/css/bootstrap.min.css">
<link type="text/css" rel="stylesheet" href="./asset/css/default.css">

</head>
<body>
	<div class="container-fluid home">
		<h2 class="page-header text-center">Ma Petite Calculatrice En Ligne</h2>
	
		<div class="resultat">
			<p>
				<b>${error}</b><br>
				Le Résultat de l'Opération <b>${val1} ${opera} ${val2} = ${resultat}</b>
			</p>
		</div>
		
		<form method="post" action="home" class="form">
			<div class="col x-40">
				<input type="text" name="val1" id="val1" class="input" placeholder="Nombre 1">
			</div>
			
			<div class="col x-20">
				<select name="operation" class="input" style="text-align:center;">
					<option value="add">+</option>
					<option value="sous">-</option>
					<option value="div">/</option>
					<option value="mult">x</option>
				</select>
			</div>
			
			<div class="col x-40">
				<input type="text" name="val2" id="val2" class="input" placeholder="Nombre 2">
			</div>
			
			<div class="col x-100">
				<button type="submit" class="button">CALCULER</button>
			</div>
		</form>
		
	</div>
</body>
</html>
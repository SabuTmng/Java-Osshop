<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Admin Panel</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	
	<header>
		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">OS Admin</a>
				</div>
				<div class="collapse navbar-collapse" id="myNavbar">
					<ul class="nav navbar-nav" style="padding-left: 70%;">
						<li class="active"><a href="./admin-panel">Dashboard</a></li>
						<li><a href="./admin-order.jsp">Orders</a></li>
						<li><a href="./admin-product.jsp">Products</a></li>
						
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3 col-md-2 sidebar">
				<ul class="nav nav-sidebar">
					<li class="active"><a href="#">Overview <span class="sr-only">(current)</span></a></li>
					<li><a href="#">Orders</a></li>
					<li><a href="#">Product</a></li>
					<li><a href="#">Category</a></li>
				</ul>
				
			</div>
			<div class="col-sm-9 col-md-10 main">
				<h1 class="page-header" >Dashboard</h1>
				<div class="row placeholders">
					<div class="col-xs-6 col-sm-3 placeholder">
						<h4 >Orders</h4>
						<span class="text-muted">Placeholder</span>
					</div>
					<div class="col-xs-6 col-sm-3 placeholder">
						<h4>Products</h4>
						<span class="text-muted">Placeholder</span>
					</div>
					<div class="col-xs-6 col-sm-3 placeholder">
						<h4>Categories</h4>
						<span class="text-muted">Placeholder</span>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
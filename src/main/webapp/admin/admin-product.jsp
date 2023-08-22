<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Admin Product Page</title>
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
				<div class="collapse navbar-collapse" id="myNavbar" style="padding-left: 70%;">
					<ul class="nav navbar-nav">
						<li><a href="./admin-panel.jsp">Dashboard</a></li>
						<li><a href="./admin-order.jsp">Orders</a></li>
						<li class="active"><a href="./admin-product.jsp">Products</a></li>
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
				<h1 class="page-header">Products</h1>
				<div class="row">
					<div class="col-md-12">
						<a href="./admin-addProduct.jsp" class="btn btn-primary pull-right">Add Product</a>
					</div>
				</div>
				<br>
				<div class="table-responsive">
					<table class="table table-striped">
						<thead>
							<tr>
								<th>ID</th>
								<th>Product Name</th>
								<th>Qty</th>
								<th>Price</th>
								<th>Description</th>
								<th>Action</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>1</td>
								<td>Product 1</td>
								<td>10</td>
								<td>$10.00</td>
								<td>Description of Product 1</td>
								<td>
									<a href="./admin-productEdit.jsp"><button class="btn btn-primary" onclick="editProduct(1)">Edit</button></a>
									<button class="btn btn-danger" onclick="deleteProduct(1)">Delete</button>
								</td>
							</tr>
							<tr>
								<td>2</td>
								<td>Product 2</td>
								<td>5</td>
								<td>$20.00</td>
								<td>Description of Product 2</td>
								<td>
									<a href="./admin-productEdit.jsp"><button class="btn btn-primary" onclick="editProduct(2)">Edit</button></a>
									<button class="btn btn-danger" onclick="deleteProduct(2)">Delete</button>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
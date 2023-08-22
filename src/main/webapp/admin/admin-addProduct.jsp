<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Admin Add New Product</title>
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
						<li><a href="./admin-panel.jsp">Dashboard</a></li>
						<li><a href="./admin-order.jsp">Orders</a></li>
						<li class="active"><a href="./admin-product">Products</a></li>
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
		<h1>Add New Product</h1>
		<form>
			<div class="form-group">
				<label for="name">Product Name:</label>
				<input type="text" class="form-control" id="name" placeholder="Enter product name">
			</div>
			<div class="form-group">
				<label for="description">Product Description:</label>
				<textarea class="form-control" id="description" rows="5"></textarea>
			</div>
			<div class="form-group">
				<label for="price">Price:</label>
				<input type="text" class="form-control" id="price" placeholder="Enter price">
			</div>
			<div class="form-group">
				<label for="image">Product Image:</label>
				<input type="file" class="form-control-file" id="image">
			</div>
			<div class="form-group">
				<label for="category">Category:</label>
				<select class="form-control" id="category">
					<option>Select a category</option>
					<option>Women</option>
					<option>Men</option>
					<option>Kids</option>
				</select>
			</div>

			<div class="form-group">
    			<label for="status">Status:</label>
    			<select class="form-control" id="status" name="status" required>
      				<option value="0" {% if product.status == 0 %}selected{% endif %}>Inactive</option>
      				<option value="1" {% if product.status == 1 %}selected{% endif %}>Active</option>
    			</select>
  			</div>

			<div class="form-group">
    			<label for="discount_coupon">Discount Coupon:</label>
    			<input type="text" class="form-control" id="discount_coupon" name="discount_coupon" value="discount %">
  			</div>
			<button type="submit" class="btn btn-primary">Add Product</button>
		</form>
	</div>
</body>
</html>
<html>
<head>
<meta charset="UTF-8">
<title>OneStopShop</title>
<link rel="stylesheet" href="style.css">


<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f2f2f2;
	margin: 0;
}

form {
	display: flex;
	align-items: center;
}

input[type="text"],
select {
	padding: 10px;
	border: none;
	background-color: #f2f2f2;
	margin-right: 10px;
}

button[type="submit"] {
	padding: 10px 20px;
	background-color: #4CAF50;
	color: #ffffff;
	border: none;
	cursor: pointer;
}

main {
	display: flex;
	flex-wrap: wrap;
	justify-content: center;
	align-items: center;
	padding: 50px;
}

.product {
	background-color: #ffffff;
	width: 300px;
	margin: 20px;
	padding: 20px;
	border-radius: 5px;
	box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.1);
	text-align: center;
}

.product img {
	width: 100%;
	height: auto;
}

.product h2 {
	font-size: 20px;
	margin: 10px 0;
}

.product p {
	font-size: 16px;
	margin: 10px 0;
	color: #999999;
}

.product button {
	padding: 10px 20px;
	background-color: #4CAF50;
	color: #ffffff;
	border: none;
	cursor: pointer;
	margin-top: 10px;
}

.dropdown{
	position: absolute;
    top: 0px;
    right: 0px;
}

.dropdown-content {
  display: none;
}

</style>

</head>
<body>
	<header>
		<h1>One Stop Shop</h1>
		<nav>
			<ul>
				<li><a href="./index.jsp">Home</a></li>
				<li><a href="./category.jsp">Category</a></li>
				<li><a href="./product.jsp">Product</a></li>
				<li><a href="./contact.jsp" class="active">Contact Us</a></li>
				<li><a href="./login.jsp" class="active">Login</a></li>
				<li><a href="./signup.jsp" class="active">Sign Up</a></li>
				<li><a href="./cart.jsp">Cart</a></li>
				
				<li class="dropdown">
      				<button class="account-btn">My Account</button>
      				<div class="dropdown-content">
      					<ol style="list-style-type: none;">
       						<li><a href="#">Profile</a></li>
        					<li><a href="#">Settings</a></li>
        					<li><a href="#">Messages</a></li>
        					<li><a href="login.jsp">Logout</a></li>
        				</ol>
      				</div>
    			</li>
			</ul>
		</nav>

		<form>
			<input type="text" placeholder="Search by category"> <select>
				<option>Highest price</option>
				<option>Highest rating</option>
			</select>
			<button type="submit">Search</button>
		</form>
	</header>

	<main>
		<section class="product">
			<img src="image/product/Kurtha.jpeg" alt="Kurtha">
			<h2>Kurtha</h2>
			<p>Rs 1850</p>
			<a href="./cart.jsp"><button>Add to cart</button></a>
		</section>

		<section class="product">
			<img src="image/product/shirt.jpeg" alt="Shirt">
			<h2>Shirt</h2>
			<p>Rs 2100</p>
			<a href="./cart.jsp"><button>Add to cart</button></a>
		</section>

		<section class="product">
			<img src="image/product/crop2.jpeg" alt="Crop Top">
			<h2>Crop Top</h2>
			<p>$39.99</p>
			<a href="./cart.jsp"><button>Add to cart</button></a>
		</section>

	</main>

	<footer>
		<a href="./index.jsp">Home</a> 
		<a href="./category.jsp">Category</a> 
		<a href="./product.jsp">Product</a> 
		<a href="./contact.jsp" class="active">Contact Us</a> 
		<a href="./login.jsp" class="active">Login</a>
		<a href="./signup.jsp" class="active">Sign Up</a>

		<div class="social-media">
			<a href="https://www.facebook.com/mycompany" target="_blank"> 
			<img src="image/icons/fb.png" alt="Facebook"></a> 
			
			<a href="https://www.twitter.com/mycompany" target="_blank"> 
			<img src="image/icons/twitter.png" alt="Twitter"></a> 
			
			<a href="https://www.instagram.com/mycompany" target="_blank"> 
			<img src="image/icons/insta.png" alt="Instagram"></a>
			
		</div>

		<p>&copy; 2023 OneStopShop. All rights reserved.</p>
	</footer>

	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script>
      $(document).ready(function() {
        $('.account-btn').click(function() {
          $('.dropdown-content').toggle();
        });
      });
    </script>
    
</body>
</html>
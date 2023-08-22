<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Product Listing - OneStopShop</title>
<link rel="stylesheet" href="style.css">

<style>
/* styles for the product container */
	.product-container {
		width: 80%;
		margin: 0 auto;
		display: flex;
		flex-wrap: wrap;
		justify-content: space-between;
	}

/* styles for each product card */
	.product-card {
		width: 30%;
		margin-bottom: 20px;
		box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
		border-radius: 5px;
		overflow: hidden;
	}

.product-image {
	width: 100%;
	height: 300px;
	object-fit: cover;
}

.product-info {
	padding: 10px;
}

.product-name {
	font-size: 18px;
	font-weight: bold;
	margin-bottom: 10px;
}

.product-price {
	font-size: 16px;
	font-weight: bold;
	color: #008CBA;
	margin-bottom: 10px;
}

.product-description {
	font-size: 14px;
	margin-bottom: 10px;
}

.product-button {
	background-color: #008CBA;
	color: white;
	padding: 10px;
	border: none;
	border-radius: 5px;
	font-size: 16px;
	cursor: pointer;
	margin-top: 10px;
}

.product-button:hover {
	background-color: #0077B5;
	
	/* Footer */ 
	
	.footer { 
	background-color : #333;
	color: #fff;
	padding: 20px;
	text-align: center;
}

.footer p {
	margin: 0;
}

.social-media {img
	
}

/* Style all font awesome icons */
.fa {
	padding: 20px;
	font-size: 30px;
	width: 15px;
	text-align: center;
	text-decoration: none;
}

/* Add a hover effect */
.fa:hover {
	opacity: 0.7;
}

.social-media img {
	width: 20px;
	height: 20px;
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
				<li><a href="./contact.jsp">Contact Us</a></li>
				<li><a href="./cart.jsp">Cart</a></li>
				
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

	<div class="product-container">
		<div class="product-card">
			<img class="product-image" src="image/product/shirt.jpeg" alt="T-shirt">
			
			<div class="product-info">
			
				<div class="product-name">shirt</div>
				<div class="product-price">Rs: 2100</div>
				<div class="product-description">Shirt for men is now available. Made of pure silk.Can be paired with anything, hurry up and get yours now..</div>
				
				<form method="post" action="AddToCartServlet">
					<input type="hidden" name="productId" value="1">
					<button type="submit" class="product-button">Add to Cart</button>
				</form>
				
			</div>
		</div>
		
		<div class="product-card">
			<img class="product-image" src="image/product/Skirt.jpeg" alt="Skirt">
			
			<div class="product-info">
				<div class="product-name">Skirt</div>
				<div class="product-price">Rs 1350</div>
				<div class="product-description">Available in different color
					and sizes. Perfect for summer, get yours now.</div>
				<button class="product-button">Add to Cart</button>
			</div>
		</div>
		
		<div class="product-card">
			<img class="product-image" src="image/product/Jacket.jpeg" alt="Jacket">
			
			<div class="product-info">
				<div class="product-name">Jacket</div>
				<div class="product-price">Rs 3200</div>
				<div class="product-description">Water Proof jacket, get yours
					now for this rainy season.</div>
				<button class="product-button">Add to Cart</button>
			</div>
			
		</div>
		
		<div class="product-card">
			<img class="product-image" src="image/product/Shorts.jpeg" alt="Shorts">
			<div class="product-info">
				<div class="product-name">Shorts</div>
				<div class="product-price">Rs 1450</div>
				<div class="product-description">Jeans shorts now available in
					different sizes. Get yours now!.</div>
				<button class="product-button">Add to Cart</button>
			</div>
		</div>
		
		<div class="product-card">
			<img class="product-image" src="image/product/Kurtha.jpeg" alt="Kurtha">
			<div class="product-info">
				<div class="product-name">Kurtha</div>
				<div class="product-price">Rs 3900</div>
				<div class="product-description">Perfect for this wedding
					season. Get now for reasonable price.</div>
				<button class="product-button">Add to Cart</button>
			</div>
		</div>
		
		<div class="product-card">
			<img class="product-image" src="image/product/OnePiece.jpeg" alt="One Piece">
			<div class="product-info">
				<div class="product-name">One Piece</div>
				<div class="product-price">Rs 2100</div>
				<div class="product-description">One-piece that is best for
					parties. Very comfortable and elegant.</div>
				<button class="product-button">Add to Cart</button>
			</div>
		</div>
		
	</div>
	
	<footer>
		<a href="./index.jsp">Home</a> 
		<a href="./category.jsp">Category</a> 
		<a href="./product.jsp">Product</a> 
		<a href="./contact.jsp">ContactUs</a>
		<a href="./cart.jsp">Cart</a>

		<div class="social-media">

			<a href="https://www.facebook.com/mycompany" target="_blank"> 
			<img src="image/icons/fb.png" alt="Facebook"> </a> 
			
			<a href="https://www.twitter.com/mycompany" target="_blank"> 
			<img src="image/icons/twitter.png" alt="Twitter"></a> 
			
			<a href="https://www.instagram.com/mycompany" target="_blank"> 
			<img src="image/icons/insta.png" alt="Instagram"></a>

		</div>

		<p>Copyright &copy; 2023 OneStopShop. All rights reserved.</p>

	</footer>

</body>
</html>
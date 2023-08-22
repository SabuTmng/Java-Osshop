<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>OneStopShop</title>
<link rel="stylesheet" href="style.css">

</head>
<body>
	<header>
		<h1>One Stop Shop</h1>
		 <nav>
		 	<ul>
		 		<li><a href="./index.jsp">Home</a></li>
        		<li><a href="./category.jsp">Category</a></li>
        		<li><a href="./product.jsp">Product</a></li>
        		<li><a href="./contactUs.jsp" class="active">Contact Us</a></li>
      		</ul>
    	</nav>
    	
		<form>
			<input type="text" placeholder="Search by category">
			<select>
				<option>Highest price</option>
				<option>Highest rating</option>
			</select>
			<button type="submit">Search</button>
		</form>
	</header>
	
	<main>
		<section class="product">
			<img src="image/product/Kurtha.jpeg" alt="Product 1">
			<h2>Product 1</h2>
			<p>Rs 1850</p>
			<button>Add to cart</button>
		</section>
		<section class="product">
			<img src="image/product/shirt.jpeg" alt="Product 2">
			<h2>Product 2</h2>
			<p>Rs 2100</p>
			<button>Add to cart</button>
		</section>
		<section class="product">
			<img src="image/product/crop2.jpeg" alt="Product 3">
			<h2>Product 3</h2>
			<p>$39.99</p>
			<button>Add to cart</button>
		</section>
	</main>
	
	<footer>
    	<a href="./index.jsp">Home</a>
    	<a href="./category.jsp">Category</a>
    	<a href="./product.jsp">Product</a>
    	<a href="./contactUs.jsp" class="active">Contact Us</a>

    	<div class="social-media">
      		<a href="https://www.facebook.com/mycompany" target="_blank">
        	<img src="image/icons/fb.png" alt="Facebook">
      		</a>

      		<a href="https://www.twitter.com/mycompany" target="_blank">
        	<img src="image/icons/twitter.png" alt="Twitter">
      		</a>

      		<a href="https://www.instagram.com/mycompany" target="_blank">
        	<img src="image/icons/insta.png" alt="Instagram">
      		</a>
    	</div>

    	<p>&copy; 2023 OneStopShop. All rights reserved.</p>
  	</footer>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <title>OneStopShop - Cart</title>
  <link rel="stylesheet" href="style.css">
  
	<style>
	body {
      font-family: Arial, sans-serif;
      background-color: #f2f2f2;
      margin: 0;
    }
  
    .cart-container {
      max-width: 800px;
      margin: 50px auto;
      padding: 20px;
      background-color: #ffffff;
      border-radius: 5px;
      box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.1);
    }
  
    h1 {
      font-size: 24px;
      margin-bottom: 20px;
    }
  
    .cart-item {
      display: flex;
      align-items: center;
      margin-bottom: 20px;
    }
  
    .cart-item img {
      width: 100px;
      height: auto;
      margin-right: 10px;
    }
  
    .cart-item-details {
      flex-grow: 1;
    }
  
    .cart-item-name {
      font-size: 18px;
      margin-bottom: 5px;
    }
  
    .cart-item-price {
      font-size: 16px;
      color: #999999;
    }
  
    .cart-item-remove {
      font-size: 14px;
      color: #ff0000;
      cursor: pointer;
    }
  
    .checkout-btn {
      padding: 10px 20px;
      background-color: #4CAF50;
      color: #ffffff;
      border: none;
      cursor: pointer;
      float: right;
    }
    
	.dropdown{
	position: absolute;
    top: 0px;
    right: 0px;
	}

	.dropdown-content {
	display: none;
	}
	
	.continue-shopping-btn {
      padding: 10px 20px;
      background-color: #4CAF50;
      color: #ffffff;
      border: none;
      cursor: pointer;
      float: left;
      margin-right: 10px;
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
	</header>
	
	<div class="cart-container">
    <h1>Your Cart</h1>
  
    <div class="cart-item">
      <img src="image/product/Kurtha.jpeg" alt="Kurtha">
      <div class="cart-item-details">
        <div class="cart-item-name">Kurtha</div>
        <div class="cart-item-price">Rs 1850</div>
      </div>
      <div class="cart-item-remove">Remove</div>
    </div>
  
    <div class="cart-item">
      <img src="image/product/shirt.jpeg" alt="Shirt">
      <div class="cart-item-details">
        <div class="cart-item-name">Shirt</div>
        <div class="cart-item-price">Rs 2100</div>
      </div>
      <div class="cart-item-remove">Remove</div>
    </div>
  
    <div class="cart-item">
      <img src="image/product/crop2.jpeg" alt="Crop Top">
      <div class="cart-item-details">
        <div class="cart-item-name">Crop Top</div>
        <div class="cart-item-price">Rs 1800</div>
      </div>
      <div class="cart-item-remove">Remove</div>
    </div>
  
	<button class="continue-shopping-btn" onclick="location.href='./product.jsp'">Continue Shopping</button>
    <button class="checkout-btn">Checkout</button>
  </div>
  
	<footer>
		<a href="./index.jsp">Home</a> 
		<a href="./category.jsp">Category</a> 
		<a href="./product.jsp">Product</a> 
		<a href="./contact.jsp" class="active">Contact Us</a> 

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
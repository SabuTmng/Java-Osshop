<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Contact Us - OneStopShop</title>
<link rel="stylesheet" href="style.css">
</head>

<body>
	<!-- Header section -->
	<header>
		<h1>OneStopShop</h1>
		<nav>
			<ul>
				<li><a href="./index.jsp">Home</a></li>
				<li><a href="./category.jsp">Category</a></li>
				<li><a href="./product.jsp">Product</a></li>
				<li><a href="./contact.jsp">Contact Us</a></li>
			</ul>
		</nav>
	</header>

	<!--section of the page  -->
	<section>
		<!-- main class of the body -->
		<div class="main">
			<div class="contacttext">
				<div class="desc">
					<h2>Feel Free to contact Me. Thank you!</h2>

				</div>
			</div>

			<!-- form with java -->
			<div class="form" style="test-align: center";>
				<div
					style="padding: 20px; border-radius: 10px; box-shadow: var(- -shadow); width: 50%;">
					<h1 style="text-align: center;">Get in Touch</h1>

					<form style="display: flex; justify-content: center;" name="myform"
						onsubmit="formValidate()">
						<div
							style="height: 90%; width: 70%; display: flex; flex-direction: column; margin: auto;">
							<label>Full Name:</label> <input type="text" name="fullname"
								placeholder="Name"> <label>Phone No:</label> <input
								type="text" name="phone" placeholder="Phone"> <label>Email:</label>
							<input type="email" name="email" placeholder="Email"> <label>Address:</label>
							<input type="text" name="address" placeholder="Address">

							<label>Message</label>
							<textarea name="message" cols="30" rows="10"
								placeholder="Message" style="resize: none;"></textarea>

							<input style="border: none; margin-top: 20px;" class="button"
								type="submit" value="Send">
						</div>
					</form>
				</div>

			</div>
		</div>

	</section>

	<!-- Footer section -->
	<footer>
		<a href="./index.jsp">Home</a> <a href="./category.jsp">Category</a> <a
			href="./product.jsp">Product</a> <a href="./contact.jsp"
			class="active">Contact Us</a>

		<div class="social-media">
			<a href="https://www.facebook.com/mycompany" target="_blank"> <img
				src="image/icons/fb.png" alt="Facebook"></a> <a
				href="https://www.twitter.com/mycompany" target="_blank"> <img
				src="image/icons/twitter.png" alt="Twitter"></a> <a
				href="https://www.instagram.com/mycompany" target="_blank"> <img
				src="image/icons/insta.png" alt="Instagram"></a>
		</div>

		<p>&copy; 2023 OneStopShop. All rights reserved.</p>
	</footer>
</body>
</html>
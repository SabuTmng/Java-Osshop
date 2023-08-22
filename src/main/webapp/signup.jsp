<!DOCTYPE html>
<html>
<head>
	<title>User Registration</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<style>
		body {
			font-family: Arial, sans-serif;
			background-color: #f5f5f5;
			margin: 0;
			padding: 0;
		}
		form {
			background-color: #fff;
			border-radius: 5px;
			box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
			margin: 20px auto;
			max-width: 500px;
			padding: 20px;
		}
		h1 {
			text-align: center;
		}
		label {
			display: block;
			font-size: 16px;
			font-weight: bold;
			margin-bottom: 10px;
		}
		input[type="text"],
		input[type="email"],
		input[type="password"],
		input[type="file"] {
			border-radius: 5px;
			border: none;
			box-shadow: 0 0 5px rgba(0, 0, 0, 0.2);
			font-size: 16px;
			margin-bottom: 10px;
			padding: 10px;
			width: 100%;
		}
		input[type="submit"] {
			background-color: #4CAF50;
			border-radius: 5px;
			border: none;
			color: #fff;
			cursor: pointer;
			font-size: 16px;
			padding: 10px 20px;
		}
		input[type="submit"]:hover {
			background-color: #3e8e41;
		}
		.image-container {
			background-color: #f5f5f5;
			border: 1px solid #ccc;
			border-radius: 5px;
			height: 120px;
			width: 200px;
			display: flex;
			align-items: center;
			justify-content: center;
			overflow: hidden;
			margin-bottom: 20px;
		}
		.image-container img {
			max-width: 100%;
			max-height: 100%;
			object-fit: contain;
		}
	</style>
</head>
<body>
	<form action="SignupServlet" method="post" enctype="multipart/form-data">
		<h1>User Signup Form</h1>
		

		<label for="profile_picture">Choose a Profile Picture:</label>
		<input type="file" name="profile_picture" id="profile_picture"><br><br>

		<label for="firstname">Firstname:</label>
		<input type="text" name="firstname" id="firstname" required><br><br>

		<label for="lastname">Lastname:</label>
		<input type="text" name="lastname" id="lastname" required><br><br>
		
		<label for="email">Email:</label>
		<input type="email" name="email" id="email" size="50" required><br><br>
		
		
		<label for="phoneNo">Phone No:</label>
		<input type="text" name="phoneNo" id="phoneNo" required><br><br>
		
		<label for="addressLine1">Address Line 1:</label>
		<input type="text" name="addressLine1" id="addressLine1" required><br><br>

		<label for="addressLine2">Address Line 2:</label>
		<input type="text" name="addressLine2" id="addressLine2" required><br><br>
		
		<label for="city">City:</label>
		<input type="text" name="city" id="city" required><br><br>
		
		<label for="state">State:</label>
		<input type="text" name="state" id="state" required><br><br>
		
		<label for="zipCode">Zip Code:</label>
		<input type="text" name="zipCode" id="zipCode" required><br><br>
		
		<label for="country">Country:</label>
		<input type="text" name="country" id="country" required><br><br>
		
		<label for="password">Password:</label>
		<input type="password" name="password" id="password" required><br><br>

		<label for="confirm_password">Confirm Password:</label>
		<input type="password" name="confirmPassword" id="confirmPassword" required><br><br>

		<input type="submit" value="Register">
	</form>

</body>
</html>
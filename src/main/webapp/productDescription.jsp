<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Description</title>
    
    <style>
      body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
      }
      
      header {
        background-color: white;
        box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.3);
        padding: 20px;
      }
      
      h1 {
        font-size: 24px;
        margin: 0;
      }
      
      p {
        font-size: 16px;
        color: gray;
      }
      
      img {
        max-width: 100%;
        height: auto;
      }
      
      .product-info {
        background-color: white;
        border-radius: 5px;
        box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.3);
        margin: 0 auto;
        max-width: 800px;
        padding: 20px;
        display: flex;
        flex-wrap: wrap;
        justify-content: space-between;
      }
      
      .product-image {
        flex-grow: 1;
        margin-right: 20px;
        margin-bottom: 20px;
      }
      
      .product-description {
        flex-grow: 2;
      }
      
      h2 {
        font-size: 20px;
        margin-top: 0;
      }
      
      .price {
        color: red;
        font-size: 24px;
        font-weight: bold;
        margin-bottom: 10px;
      }
      
      p.description {
        font-size: 16px;
        margin-bottom: 20px;
      }
      
      .size-chart {
        font-size: 16px;
        line-height: 1.5;
        margin-bottom: 20px;
      }
      
      h3 {
        font-size: 20px;
        font-weight: bold;
        margin-top: 0;
      }
      
      table {
        border-collapse: collapse;
        width: 100%;
      }
      
      th {
        background-color: gray;
        border: 1px solid gray;
        color: white;
        padding: 8px;
        text-align: left;
      }
      
      td {
        border: 1px solid gray;
        padding: 8px;
      }
    </style>  
  </head>
  
  <body>
  
    <header>
      <h1>Product Name</h1>
      <p>A short description of the product.</p>
    </header>
    
    <div class="product-info">
      <div class="product-image">
        <img src="product-image.jpg" alt="Product Image">
      </div>
      
      <div class="product-description">
        <h2>Product Name</h2>
        <div class="price">$29.99</div>
        <p class="description">Lorem ipsum dolor sit amet, consectetur adipiscing eli.</p>
        <div class="size-chart">
          <h3>Size Chart</h3>
          <table>
            <tr>
              <th>Size</th>
              <th>Bust</th>
              <th>Waist</th>
              <th>Hip</th>
            </tr>
            <tr>
              <td>Small</td>
              <td>34"</td>
              <td>26"</td>
              <td>36"</td>
            </tr>
            <tr>
              <td>Medium</td>
              <td>36"</td>
              <td>28"</td>
              <td>38"</td>
            </tr>
            <tr>
              <td>Large</td>
              <td>38"</td>
              <td>30"</td>
              <td>40"</td>
            </tr>
            <tr>
              <td>X-Large</td>
              <td>40"</td>
              <td>32"</td>
              <td>42"</td>
            </tr>
          </table>
        </div>
        <form>
          <label for="size">Size:</label>
          <select id="size" name="size">
            <option value="small">Small</option>
            <option value="medium">Medium</option>
            <option value="large">Large</option>
            <option value="xlarge">X-Large</option>
          </select>
          <br>
          <label for="quantity">Quantity:</label>
          <input type="number" id="quantity" name="quantity" value="1" min="1" max="10">
          <br>
          <button type="submit">Add to Cart</button>
        </form>
      </div>
    </div>
  </body>
</html>
          

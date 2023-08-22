package com.osshop.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.osshop.model.Cart;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProductServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Retrieve product data from a database or other source
		String productName = "Example Product";
		String productDescription = "This is an example product description.";

		// Set the content type to HTML
		response.setContentType("text/html");

		// Get a PrintWriter to write HTML to the response
		PrintWriter out = response.getWriter();

		// Write HTML to the response
		out.println("<html>");
		out.println("<head><title>Product</title></head>");
		out.println("<body>");
		out.println("<h1>" + productName + "</h1>");
		out.println("<p>" + productDescription + "</p>");
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Get the product ID from the request parameters
		int productId = Integer.parseInt(request.getParameter("productId"));

		// Add the product to the user's shopping cart (assuming the shopping cart is
		// stored in the session)
		HttpSession session = request.getSession();
		Cart cart = (Cart) session.getAttribute("cart");
		if (cart == null) {
			cart = new Cart(productId, productId, productId, null, null);
			session.setAttribute("cart", cart);
		}
		cart.addProduct(productId);

		// Redirect the user back to the product page
		response.sendRedirect("product");
	}

}

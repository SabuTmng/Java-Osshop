package com.osshop.controller;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.osshop.dao.UserDao;
import com.osshop.model.User;

/**
 * Servlet implementation class SignupServlet
 */
@WebServlet("/SignupServlet")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 10, // 10 MB
		maxFileSize = 1024 * 1024 * 50, // 50 MB
		maxRequestSize = 1024 * 1024 * 100)
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SignupServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String email = request.getParameter("email");
		String phoneNo = request.getParameter("phoneNo");
		String addressLine1 = request.getParameter("addressLine1");
		String addressLine2 = request.getParameter("addressLine2");
		String city = request.getParameter("city");
		int state = Integer.parseInt(request.getParameter("state"));
		int zipCode = Integer.parseInt(request.getParameter("zipCode"));
		String country = request.getParameter("country");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmPassword");

		UserDao userdao = new UserDao();
		User user = new User();

		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setPhoneNo(phoneNo);
		user.setAddressLine1(addressLine1);
		user.setAddressLine2(addressLine2);
		user.setCity(city);
		user.setStateId(state);
		user.setZipCode(zipCode);
		user.setCountry(country);
		user.setPassword(confirmPassword);

		boolean rs = userdao.create(user);

		if (rs) {

			Part filePart = request.getPart("profile_picture");

			if (filePart != null) {
				// prints out some information for debugging
				String fileName = filePart.getSubmittedFileName();
				System.out.println(filePart.getName());
				System.out.println(filePart.getSize());
				System.out.println(filePart.getContentType());

				filePart.write("C:\\upload\\" + fileName);
			}

			RequestDispatcher rd = request.getRequestDispatcher("signup-success.jsp");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("signup-failed.jsp");
			rd.forward(request, response);
		}
	}

}

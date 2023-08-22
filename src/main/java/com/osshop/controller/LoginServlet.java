package com.osshop.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.osshop.dao.UserDao;
import com.osshop.exception.InvalidLoginException;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://127.0.0.1/osshopdb";

	static final String userName = "root";
	static final String userPassword = "";

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		PrintWriter p = response.getWriter();

		// Get the session object
		HttpSession session = request.getSession();
		String sessionId = session.getId();
		System.out.println("The session Id is " + sessionId);

		UserDao userDao = new UserDao();
		boolean result;
		try {
			result = userDao.login(username, password);

			if (result) {
				session.setAttribute("user", username);
				session.setAttribute("login", "true");
				p.append("You are valid user. Welcome " + username);
				response.sendRedirect("index.jsp");

			} else {
				p.append("Username or password is invalid");
				RequestDispatcher rd = request.getRequestDispatcher("login-error.jsp");
				rd.forward(request, response);

			}

		} catch (InvalidLoginException e) {
			e.printStackTrace();
		}

	}
}
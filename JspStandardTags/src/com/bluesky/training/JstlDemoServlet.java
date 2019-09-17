package com.bluesky.training;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jstlDemo")
public class JstlDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public String name;
	public String password;
	String[] movieList = { "prem", "kamal", "osipalli" };
	String[] newuser;

	public JstlDemoServlet() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		name = request.getParameter("username");
		password = request.getParameter("password");
		request.setAttribute("name", name);
		request.setAttribute("password", password);
		request.setAttribute("movieList", movieList);
		getServletContext().getRequestDispatcher("/jstlDemo.jsp").forward(request, response);
	}

}

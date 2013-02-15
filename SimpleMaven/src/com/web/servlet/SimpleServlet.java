package com.web.servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/helo.html")
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("t1");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body><h3> Hello From Servlet</h3><br/>");
		out.println("Name is: "+name);
		out.println("</body>");
		out.println("</html>");
		System.out.println("Welcome to GIT World....");
	}
}

package com.businesslogic;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;


import javax.servlet.http.HttpSession;

@WebServlet("/WelcomeUser")
public class WelcomeUser extends HttpServlet {
	
    public WelcomeUser() {
       
        // TODO Auto-generated constructor stub
    }

	
	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		String uname=(String)session.getAttribute("username");
		out.println("Welcome User"+uname);
		out.println("<a href='Logout'>Logout</a>");
		
		
	}

}

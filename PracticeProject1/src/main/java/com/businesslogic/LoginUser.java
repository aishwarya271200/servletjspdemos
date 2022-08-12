package com.businesslogic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginUser")
public class LoginUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginUser() {
       
        // TODO Auto-generated constructor stub
    }

	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//response.setContentType("text/html");
//		
//	 	String uname=request.getParameter("txtUname");
//		String pword=request.getParameter("txtPassword");
//		PrintWriter out=response.getWriter();
//		
//		if(uname.equalsIgnoreCase("Aishu") && pword.equals("Aishu00")){
//			out.println("You are Welcome");
//			
//		}
//		else
//			out.println("Invalid Username or Password"); 
//	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
response.setContentType("text/html");
		
		String uname=request.getParameter("txtUname");
		String pword=request.getParameter("txtPassword");
		PrintWriter out=response.getWriter();
		RequestDispatcher rd ;
		if(uname.equalsIgnoreCase("Aishu") && pword.equals("Aishu00")){
			HttpSession session=request.getSession(true);//create a new object and store its reference in session object
			session.setAttribute("username", uname);
			
			rd=request.getRequestDispatcher("WelcomeUser");
			rd.forward(request, response);
		}
		else
			out.println("Invalid Username or Password");
		rd=request.getRequestDispatcher("UserLogin.html");
		rd.include(request, response);
	}

}

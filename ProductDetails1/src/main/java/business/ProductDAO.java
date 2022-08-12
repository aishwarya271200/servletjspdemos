package business;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import business.Product;


@WebServlet("/ProductDAO")
public class ProductDAO extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ProductDAO() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// reading form values
String id = request.getParameter("productId");
				String qty = request.getParameter("productqty");
				String name = request.getParameter("productName");
				// put values in Object
				Product stud = new Product();
				stud.setProductId(1);
				stud.setProductqty(qty);
				stud.setProductName(name);
				HttpSession session = request.getSession();				
				
//				Product p1 = new Product(Integer.parseInt(request.getParameter("productId")), request.getParameter("productName"),(request.getParameter("productqty")));
				session.setAttribute("Product", stud);
				response.sendRedirect("display.jsp");
				
			}
	

	
	
}


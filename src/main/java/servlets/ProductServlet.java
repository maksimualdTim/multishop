package servlets;

import java.io.IOException;

import dao.ProductDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Product;


public class ProductServlet extends HttpServlet{
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
    	
    	String pathInfo = request.getPathInfo();
    	
    	String[] pathParts = pathInfo.split("/");

    	String productId = pathParts[1];
    	Product product = null;
    	
    	try {
    		product = ProductDAO.get(Integer.parseInt(productId));
		} catch (NumberFormatException e) {
			request.getRequestDispatcher("../404.jsp").forward(request, response);
		}
    	
    	if(product == null)
    		request.getRequestDispatcher("../404.jsp").forward(request, response);
    	request.setAttribute("productName", product.getName());
    	request.setAttribute("productShortDescription", product.getShortDescription());
    	request.setAttribute("description", product.getDescription());
    	
    	request.getRequestDispatcher("../product.jsp").forward(request, response);
    }
}

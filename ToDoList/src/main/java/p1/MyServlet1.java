package p1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class MyServlet1 extends HttpServlet {
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		 response.setContentType("text/html");
		 PrintWriter out=response.getWriter();
		 out.println("<h1>MyServlet1</h1>");
	     System.out.println(request.getParameter("uname"));
	    		 
	}

	

}

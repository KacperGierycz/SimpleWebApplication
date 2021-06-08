package firstservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class XmlServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("XML servlet called");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName= request.getParameter("userName");
		out.println("Hello! from Get method User! "+userName);
	
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("XML servlet called");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName= request.getParameter("userName");
		out.println("Hello! from Post method User! "+userName);
	
		
	}

}

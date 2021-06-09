package firstservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class XmlServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("XML servlet called");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName= request.getParameter("userName");
		HttpSession session= request.getSession();
		ServletContext context =request.getServletContext();
		if(userName!="" && userName!=null) {
		session.setAttribute("saveduserName", userName);
		context.setAttribute("saveduserName", userName);
	}
		
		out.println("Hello! from GET method  "+userName);
		out.println("User name from session "+(String) session.getAttribute("saveduserName"));
		out.println("User name from context "+(String) context.getAttribute("saveduserName"));

		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("XML servlet called");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName= request.getParameter("userName");
		String fullName= request.getParameter("fullName");

		out.println("Hello! from POST method  "+userName +" We know Your full name: "
				+fullName);
		String prof= request.getParameter("prof");
	//	String location=request.getParameter("location");
		String[] location=request.getParameterValues("location");
		out.println("You are a " + prof +" From "+location[0]);
		
	
	}

}

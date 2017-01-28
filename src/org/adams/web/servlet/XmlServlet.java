package org.adams.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public XmlServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("xmlServlet : I am in the doGet method");
		PrintWriter writer = response.getWriter();
		
		
		// Get the parameter value from the request object
		//http://localhost:8080/SimpleServletProject/xmlServletPath?userName=Tariq Ahsan&userId=tariqahsan
		String userName = request.getParameter("userName");
		String userId = request.getParameter("userId");
		writer.println("<h2>Hello from the GET method of the XmlServlet</h3>");
		writer.println("Hello user " + userName + ". Your user ID is " + userId);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("xmlServlet : I am in the doPost method");
		PrintWriter writer = response.getWriter();
		
		
		// Get the parameter value from the request object
		//http://localhost:8080/SimpleServletProject/xmlServletPath?userName=Tariq Ahsan&userId=tariqahsan
		String userName = request.getParameter("userName");
		String name = request.getParameter("fullName");
		String prof = request.getParameter("profession");
		//String location = request.getParameter("location");
		String[] locations = request.getParameterValues("location");
		writer.println("<h2>Hello from the POST method of the XmlServlet</h3>");
		writer.println("Hello user " + userName + ". Your full name is " + name);
		writer.println(" and you are a " + prof);
		writer.println(" and you are located in -- ");
	
		for( int i=0; i < locations.length; i++ ) {
			writer.println(locations[i]);
		}
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}

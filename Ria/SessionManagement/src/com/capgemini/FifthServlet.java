package com.capgemini;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FifthServlet
 */
@WebServlet("/FifthServlet")
public class FifthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FifthServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession(false);
		
		
		out.println();
		out.println(session.getAttribute("fname"));
		out.println(session.getAttribute("lname"));
		out.println(session.getAttribute("qual"));
		String marks=request.getParameter("marks");
		//session.setAttribute("marks", marks);
		out.println(marks);
		
		
//		out.println("<html>");
//		out.println("<body>");
//		out.println("<form action=FourthServlet >");
//		out.println("Marks :<input type=text name=marks>");
//		out.println("<br><br><input type=submit />");
//		out.println("</form>");
//		out.println("</body>");
//		out.println("</html>");
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}



import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class registration
 */
public class registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String Id = null;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    PrintWriter pw=response.getWriter();
	    String q=request.getParameter(Id);
	    String s =request.getParameter("Username");
	    String t =request.getParameter("Password");
	    String a =request.getParameter("Email");
	    pw.println("<h2>Hello,"+s);
	    pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

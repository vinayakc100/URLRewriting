package url;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/set")
public class Set extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s1=request.getParameter("Book1");
		String s2=request.getParameter("Book2");
		String s3=request.getParameter("Book3");
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolor=cyan text=red>");
		pw.println("<h1>Your Books Are Added To Cart</h1>");
		pw.println("<a href=get?b1="+s1+"&b2="+s2+"&b3="+s3+">Next</a>");

		pw.println("</body></html>");
	}

}

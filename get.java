package url;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/get")
public class get extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		String s1=request.getParameter("b1");
		String s2=request.getParameter("b2");
		String s3=request.getParameter("b3");
		pw.println("<html><body bgcolor=yellow text=blue>");
		pw.println("<h1>Selected Books:</h1>");
		if(!(s1.equals("null")))
		{
		pw.println(s1);
		}
		if(!(s2.equals("null")))
		{
			pw.println(s2);
			}
			if(!(s3.equals("null")))
			{
			pw.println(s3);
			}
			pw.println("</body></html>");
	}

}

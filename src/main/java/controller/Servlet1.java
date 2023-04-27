package controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@SuppressWarnings("serial")
@WebServlet(name = "servlet1", urlPatterns = {"/Servlet1"} )

public class Servlet1 extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		PrintWriter pw = response.getWriter();
		int id = Integer.parseInt(request.getParameter("myid"));
		String name = request.getParameter("myname");
		pw.println("Student Id: " + id + " "+ "StudentName: "+ " "+name);
		
//		response.sendRedirect("Servlet1");
		
		ServletConfig config = getServletConfig();
		pw.println("Driver: "+ config.getInitParameter("driver"));
	}
}

package controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/editStdent")
public class EditStudent extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		
		
	}
}

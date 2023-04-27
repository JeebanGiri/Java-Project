package controller;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.StudentDatabaseDao;

@WebServlet("/loginstudent")
public class Login extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void Service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		int id = Integer.parseInt(request.getParameter("id"));
		String password = request.getParameter("password");
		System.out.println("The id id: "+ id + "The Password is: "+ password);
		
		StudentDatabaseDao logindao = new StudentDatabaseDao();
		boolean isLoginValid = logindao.checkLogin(id, password);
		if(isLoginValid) {
			HttpSession session = request.getSession();
			session.setAttribute("loggedInId", id);
			session.setMaxInactiveInterval(10*60);
			response.sendRedirect("ProfilePage.jsp");
		}
		else {
			RequestDispatcher sendsms = request.getRequestDispatcher("Login.jsp");
			request.setAttribute("LoginMessage", "Fail");
			sendsms.forward(request, response);
		}
	}
}

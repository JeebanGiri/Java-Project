package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StudentDatabaseDao;
import model.Students;

public class View extends HttpServlet{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentDatabaseDao dao = new StudentDatabaseDao();
		ArrayList<Students> studentList = null;
		try {
			studentList = dao.fetchConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher("view/View.jsp");
		request.setAttribute("studentList", studentList);
		rd.forward(request, response);
		
		
	}
}

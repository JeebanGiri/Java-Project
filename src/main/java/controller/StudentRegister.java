package controller;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.AESEncryption;
import java.io.IOException;
import java.io.PrintWriter;
import model.StudentDatabaseDao;
import model.Students;


@SuppressWarnings("serial")
@WebServlet("StudentRegistration")
public class StudentRegister extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException  
	{	
		int id = Integer.parseInt(request.getParameter("myid"));
		String name = request.getParameter("myname");
		String address = request.getParameter("myaddress");
		String password = request.getParameter("mypassword");
		String encryptedPassword = AESEncryption.encrypt(password);
		String gender = request.getParameter("mygender");
		String comment = request.getParameter("myText");
		String relativePath = "userImage/" + id + ".png";
		
		Students st = new Students( id,  name, address, encryptedPassword,  gender, comment,relativePath );
		
		StudentDatabaseDao sdao = new StudentDatabaseDao();
		String message = sdao.registerStudent(st);
		
		if(message.equals("Sucesfully Added")) {
			Part image = request.getPart("image");
			String imagePath = getServletContext().getInitParameter("imagepath");
			String fullPath = imagePath +relativePath;
			image.write(fullPath);
		}
		
		
		System.out.println("Student-ID: "+ id+ " " +"Student-Name: "+ name+" " +"Student-Address: "+ address+" " +" Password: "+ password+" " + "Gender: "+ gender +" "+ "Comment: " + comment);
//		new StudentDatabaseDao = // object creation for instance method but not necessary when we declare it static 
		
//		StudentDatabaseDao sdao = new StudentDatabaseDao();
//		String message = sdao.registerStudent(id,name,address,encryptedPassword,gender,comment);
//		
//		StudentDatabaseDao.registerStudent(id,name,address,password,gender,comment);  // directly passed
		
//		response.sendRedirect("Servlet1");		// send response with null values
//		response.sendRedirect("https://www.google.com/");	// Calling the google server redirectly
		
		RequestDispatcher includeDispatcher =request.getRequestDispatcher("Servlet1");
//		includeDispatcher.include(request,response);
		includeDispatcher.forward(request,response);				// It only send the response of Servlet1 what ew passed as response in servlet1
		
		
		
//		response.setContentType("text/html");    //setting the content type  
		PrintWriter pw = response.getWriter();
		pw.println("<h1>"+message+"<h1/>");
		
		//writing html in the stream  
//		pw.println("<html><body>");  
//		pw.println("Servlet Open");  
//		pw.println("</body></html>"); 
//		pw.close();
//		pw.println"<h1> message </h1>");
		//closing the stream  
	
		}
}


	package model;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import model.Students;
	
	
	
	public class StudentDatabaseDao { 
		ArrayList<Students> studentList = new ArrayList<Students>();
		
		public Connection getConnection() throws SQLException, ClassNotFoundException {
			String url = "jdbc:mysql://localhost: 3306/studentregistrationsystem";
			String userName = "root";
			String password ="";
			Class.forName ("com.mysql.jdbc.Driver");
			Connection conn= DriverManager.getConnection(url,userName,password);
			return conn;
		}
		
		public String registerStudent(Students student){
			Connection conn = null;
			try {
				
				String query = "insert into Student values (?,?,?,?,?,?)";
				conn = getConnection();
				PreparedStatement pt = conn.prepareStatement(query);
				pt.setInt(1, student.getId());
				pt.setString(2, student.getName());
				pt.setString(3, student.getAddress());
				pt.setString(4, student.getEncryptedPassword());
				pt.setString(5, student.getGender());
				pt.setString(6, student.getImagepath());
				int rows = pt.executeUpdate(); 
				if(rows >= 1) {
					return "Sucesfully Added";
				}
				conn.close();
			}catch(ClassNotFoundException | SQLException e) {
				// TODO Auro-generated catch block
				e.printStackTrace();
				return e.getMessage();
			}finally {
				try {
					conn.close();
				}catch (SQLException e) {
					System.out.println(e.getMessage());
					return e.getMessage();
				}
				
			}
			
			return null;
						
		}
		public  ArrayList<Students> fetchConnection() throws ClassNotFoundException {
			Connection conn=null;
			try {
//				conn.getConnection();
				String query = "select * from student";
				PreparedStatement pst = conn.prepareStatement(query);
				ResultSet table = pst.executeQuery();
				while(table.next())  
				{
					int id = table.getInt(1);
					String name = table.getString(2);
					String address = table.getString(3);
					String gender = table.getString(4);
					String confirmPassword = table.getString(5);
					String comment = table.getString(6);
					String imagePath = table.getString(7);
				
				Students student = new Students(id, name, address,gender, confirmPassword, comment, imagePath);
				studentList.add(student);
				                  
				}
				
				
			}catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}
		public boolean checkLogin(int id, String password){
			Connection conn;
			try {
				conn = getConnection();
				String query = "select * from registration where id = ? and password = ?";
				PreparedStatement pt = conn.prepareStatement(query);
				pt.setInt(1, id);
				pt.setString(2, password);
				ResultSet table = pt.executeQuery();
				conn.close();    // close the connection
				if(table.next()) {
					return true;	
				}
				else {
					return false;
				}
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
			
		}
//		 public boolean authorizeStudent(int id, String name) {
//		        try {
//		            String query = "select * from student where id = ? and name = ?";
//		            Connection conn = getConnection();
//		            PreparedStatement pst = conn.prepareStatement(query);
//		            pst.setInt(1, id);
//		            pst.setString(2, name);
//		            ResultSet result = pst.executeQuery();
//		            boolean authorized = result.next();
//		            conn.close();
//		            return authorized;
//		        } catch (ClassNotFoundException | SQLException e) {
//		            e.printStackTrace();
//		            return false;
//		        }
//		    }
		
		public void getStudentRecordById(String id) {
				
		}
	}
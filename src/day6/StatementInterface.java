package day6;


	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.*;

	public class StatementInterface {
		     private static final String url = "jdbc:mysql://localhost:3306/mydb";
		     private static final String username = "root";
		     private static final String password = "manoj";
		     
	         public static void main(String[] args) {
				  try {
					  Class.forName("com.mysql.cj.jdbc.Driver");
				  }catch(ClassNotFoundException e) {
					  e.printStackTrace();
				  }
				  
				  try {
					  Connection connection = DriverManager.getConnection(url,username,password);
					  Statement statement = connection.createStatement();
					  String query = "select * from student";
					  ResultSet resultSet = statement.executeQuery(query);
					  while(resultSet.next()) {
						  int id  = resultSet.getInt("id");
						  String name = resultSet.getString("name");
						  int age = resultSet.getInt("age");
						  int marks = resultSet.getInt("marks");
						  System.out.println("ID : "+id);
						  System.out.println("Name : "+name);
						  System.out.println("Age : "+age);
						  System.out.println("Marks : "+marks);
						  
					  }
				  }catch(SQLException e) {
					  System.out.println(e.getMessage());
				  }
			}
	}


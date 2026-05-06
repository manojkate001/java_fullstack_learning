package day6;

import java.sql.DriverManager;
import java.sql.*;
import java.sql.PreparedStatement;
public class CrudOperation {
	    private static final String url = "jdbc:mysql://localhost:3306/mydb";
	    private static final String userName = "root";
	    private static final String password = "manoj";
        public static void main(String[] args) {
			   try {
				   Class.forName("com.mysql.cj.jdbc.Driver");
			   }catch(ClassNotFoundException e) {
				   e.printStackTrace();
			   }
			   
			   try {
				   Connection connection = DriverManager.getConnection(url,userName,password);
				   
//				   retrieval of data
				   
//				   String query = "Select name from student where id = ?";
//				   PreparedStatement preparedStatement =connection.prepareStatement(query);
//				   preparedStatement.setInt(1,1);
//				   ResultSet resultSet = preparedStatement.executeQuery();
//				   if(resultSet.next()) {
//					   String result = resultSet.getString("name");
//					   System.out.println(result);
//				   }else {
//					   System.out.println("Unsuccessful");
//				   }
				   
//				   updation of the data
				   
//				   String query = "update student set marks = ? where id = ?";
//				   PreparedStatement preparedStatement = connection.prepareStatement(query);
//				   preparedStatement.setInt(1,99);
//				   preparedStatement.setInt(2,1);
//				   int rowsAffected = preparedStatement.executeUpdate();
//				   if(rowsAffected > 0) {
//					   System.out.println("Updated Successfully");
//				   }else {
//					   System.out.println("Not updated");
//				   }
			   }catch(SQLException e) {
				   System.out.println(e.getMessage());
			   }
		}
}

package day6;

import java.sql.DriverManager;
import java.sql.*;
public class PreparedStatement {
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
				Statement statement = connection.createStatement();
				
//				retrival of data
//				String query = "select * from student";
//				ResultSet resultSet = statement.executeQuery(query);
//				while(resultSet.next()) {
//					int id = resultSet.getInt("id");
//					String name = resultSet.getString("name");
//					int age = resultSet.getInt("age");
//					int marks = resultSet.getInt("marks");
//					System.out.println("ID : "+id);
//					System.out.println("Name : "+name);
//					System.out.println("Age : "+age);
//					System.out.println("Marks : "+marks);
//				}
				
				
				
//				Insertion of data
				
//				String query = String.format("insert into student (name,age,marks) values('%s',%o,%o)","Shivtej",24,87);
//				int rowsAffected = statement.executeUpdate(query);
//				if(rowsAffected > 0) {
//					System.out.println("Data Inserted Successfully");
//				}else {
//					System.out.println("Data not Inserted ");
//				}
				
				
//				Update operation
//				String query = String.format("update student set name = '%s' where id = %o", "Manoj",3);
//				int rowsAffected = statement.executeUpdate(query);
//				if(rowsAffected > 0) {
//					System.out.println("Data Updated Successfully");
//				}else {
//					System.out.println("Data not Inserted ");
//				}
				
//				delete operation
				String query = "delete from student where id = 3";
				int rowsAffected = statement.executeUpdate(query);
				if(rowsAffected>0) {
					System.out.println("Deleted Successfully");
				}else {
					System.out.println("Not Deleted");
				}
			}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		}
}

package day6;

import java.sql.DriverManager;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class BatchProcessing {
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
//        		   Statement statement = connection.createStatement();
        		   String query = "insert into student(name,age,marks) values(?,?,?)";
        		   PreparedStatement preparedStatement = connection.prepareStatement(query);
        		   Scanner sc = new Scanner(System.in);
        		   while(true) {
        			   System.out.println("Enter Name");
        			   String name = sc.next();
        			   System.out.println("Enter Age ");
        			   int age = sc.nextInt();
        			   System.out.println("Enter Marks");
        			   int marks = sc.nextInt();
        			   
        			   preparedStatement.setString(1,name);
        			   preparedStatement.setInt(2,age);
        			   preparedStatement.setInt(3, marks);
//        			   String query = String.format("Insert into student(name,age,marks) values('%s',%d,%d)", name,age,marks);
//        			   statement.addBatch(query);
        			   preparedStatement.addBatch();
        			   System.out.println("Do you want to continue");
        			   String choice = sc.next();
        			   if(choice.toUpperCase().equals("N")) {
        				   break;
        			   }
        			   
        			   
        		   }
        		   int[] arr = preparedStatement.executeBatch();
        		   
        	   }catch(SQLException e) {
        		   System.out.println(e.getMessage());
        	   }
           }
}

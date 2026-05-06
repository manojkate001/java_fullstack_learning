package Project;

import java.sql.DriverManager;
import java.sql.*;
import java.util.Scanner;
public class JdbcBankTransaction {
	     private static final String url = "jdbc:mysql://localhost:3306/lenden";
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
				 String debit_query = "update accounts set balance = balance - ? where ac_no = ?";
				 String credit_query = "update accounts set balance = balance + ? where ac_no = ?";
				 PreparedStatement d_preparedStatement = connection.prepareStatement(debit_query);
				 PreparedStatement c_preparedStatement = connection.prepareStatement(credit_query);
				 Scanner sc = new Scanner(System.in);
				 System.out.println("Enter amount");
				 double amount = sc.nextDouble();
				 d_preparedStatement.setDouble(1, amount);
				 d_preparedStatement.setInt(2, 101);
				 c_preparedStatement.setDouble(1, amount);
				 c_preparedStatement.setInt(2, 102);
				 
				 int debitRows = d_preparedStatement.executeUpdate();
		            int creditRows = c_preparedStatement.executeUpdate();

		            if (debitRows > 0 && creditRows > 0) {
		                System.out.println("Transaction Successful!");
		            } else {
		                System.out.println("Transaction Failed!");
		            }
			 }catch(SQLException e) {
				 System.out.println(e.getMessage());
			 }
		}
         
//         static boolean isSufficient(Connection connection,int ac_no,double amount) {
//        	 try {
//        		 String query = "select balance from accounts where ac_no = ?";
//        		 PreparedStatement preparedStatement = connection.prepareStatement(query);
//        		 preparedStatement.setInt(1,ac_no);
//        		 ResultSet resultSet = preparedStatement.executeQuery();
//        		 if(resultSet.next()) {
//        			 double current_balance = resultSet.getDouble("balance");
//        			 if(current_balance < amount) {
//        				 return false;
//        			 }else {
//        				 return true;
//        			 }
//        		 }
//        		
//        	 }catch(SQLException e) {
//        		 System.out.println(e.getMessage());
//        	 }
//			 return false;
//         }
}

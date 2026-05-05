package day3;
import java.util.Scanner;
public class CalculatorMain {
	   public static double  calculate(double a,String op ,double b) throws ArithmeticException, IllegalArgumentException{
		   
		   return switch(op) {
		   case "+" -> a+b ;
		   case "-" -> a-b;
		   case "*" -> a*b;
		   case "/" -> {
			   if(b == 0) {
				   throw new ArithmeticException(" Cannot divide by zero");
			   }
			   yield a/b;
		   }
		   default -> throw new IllegalArgumentException("Invalid operator");
		   };
	   }
       public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("JAVA Calculator");
		try {
		System.err.println("Enter First Number");
		double a = sc.nextDouble();
		System.out.println("Enter Operator");
		String op = sc.next();
		System.out.println("Enter Second Number");
		double b = sc.nextDouble();
		System.out.println("Result"+calculate(a,op,b));
		}catch(ArithmeticException e) {
			System.out.println("Math error"+e.getMessage());
		}catch(IllegalArgumentException e) {
			System.out.println("Input error"+e.getMessage());
		}catch(Exception e) {
			System.out.println("Unexpected error"+e.getMessage());
		}
		finally{
			System.out.println("Thank You for Using this Calculator");
		}
		
	}
}

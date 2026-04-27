package day3;

public class ExceptionHandling {
       public static void main(String[] args) {
    	   //1
//		try {
//			int n = 10 /0;
//		}catch(ArithmeticException e) {
//			System.out.println("Error : "+e.getMessage());
//		}
//		finally{
//			System.out.println("Always executable Block");
//		}
    	   
    	  //2 
//    	   try {
//    		   int arr[] = new int[5];
//    		   arr[10] = 5 ;
//    	   }catch(ArrayIndexOutOfBoundsException e) {
//    		   System.out.println("Error :"+e.getMessage());
//    	   }catch(Exception e) {
//    		   System.out.println("General Error :"+e.getMessage());
//    	   }
    	   
    	   //3
    	   int age = 17;
    	   try {
    		   if(age < 18) {
    			   throw new IllegalArgumentException("age is less than 18");
    		   }
    	   }catch(Exception e) {
    		   System.out.println(e.getMessage());
    	   }
	}
}

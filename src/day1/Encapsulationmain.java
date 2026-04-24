package day1;

public class Encapsulationmain {
      public static void main(String[] args) {
    	  encapsulation s1 = new encapsulation();
    	  s1.setAttri("Manoj", 22, 1000000);
    	  String name = s1.getName();
    	  int age = s1.getAge();
    	  double salary = s1.getsalary();
    	  System.out.println("Name : "+name);
    	  System.out.println("Age : "+age);
    	  System.out.println("Salary : "+salary);
    }
}

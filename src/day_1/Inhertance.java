package day_1;

public class Inhertance {
         String name = "Manoj";
         int age = 22;
         double salary = 100000;
         Inhertance(){
        	 System.out.println("Called from Parent Constructor");
         }
         void show() {
        	 System.out.println("Name : "+name);
        	 System.out.println("Age : "+age);
        	 System.out.println("Salary : "+salary);
         }
         void show1() {
        	 System.out.println("Call from Parent class");
         }
}
class ChildInhered extends Inhertance{
	ChildInhered(){
		System.out.println("Called form child Constructor");
	}
	void show() {
   	 System.out.println("Name : "+name);
   	 System.out.println("Age : "+age);
   	 System.out.println("Salary : "+salary);
	}
	    
}

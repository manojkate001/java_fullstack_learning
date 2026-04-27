package day_1;

public class Polymorphism {
        private String name ;
        private int age;
        private double salary;
        Polymorphism(){
        	System.out.println("Called from Parent class");
        }
        void setValues(String name,int age,double salary) {
        	this.name = name;
        	this.age = age;
        	this.salary = salary;
        }
        void getValues() {
        	System.out.println("Parent Properties");
        	System.out.println("Name :"+name);
        	System.out.println("Age : "+age);
        	System.out.println("Salary : "+salary);
        }
        void show() {
        	System.out.println("Hi From Parent");
        }
}

class childPolymorphism extends Polymorphism{
	   childPolymorphism(){
		   super();
		   System.out.println("Called from child class");
		  
	   }
	   void getValues(String name,int age,double salary,String address) {
		   System.out.println("Name : "+name);
		   System.out.println("Age : "+age);
		   System.out.println("Salary : "+salary);
		   System.out.println("Address : "+address);
	   }
	   @Override
	   void show() {
		   System.out.println("Hi From child");
	   }
}



package day_1;

public class encapsulation {
     private String name;
     private int age;
     private double salary;
     
     public void setAttri(String name,int age,double salary) {
    	 this.name = name;
    	 this.age = age;
    	 this.salary = salary;
     }
     public String getName() {
    	 return name;
     }
     public int getAge() {
    	 return age;
     }
     public double getsalary() {
    	 return salary;
     }
}

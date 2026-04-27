package day3;

public class AssignStudent {
       private int studentId;
       private String name;
       private int age;
       private double marks;
       AssignStudent(){
    	   System.out.println("Students details");
       }
       void setValues(int studentId,String name,int age,double marks) {
    	   this.studentId = studentId;
    	   this.name = name;
    	   this.age = age;
    	   this.marks = marks;
       }
       int getStudentId() {
    	   return studentId;
       }
       String getName() {
    	   return name;
       }
       int getAge() {
    	   return age;
       }
       double getMarks() {
    	   return marks;
       }
       String getGrade(double marks) {
    	   if(marks > 90) {
    		   return "A";
    	   }else if(marks > 75 && marks <= 90) {
    		   return "B";
    	   }else if(marks > 50 && marks <= 75) {
    		   return "C";
    	   }
    	   else {
    		   return "D";
    	   }
       }
}

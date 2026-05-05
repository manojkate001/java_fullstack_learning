package Project;
import java.util.*;
class Student {
	  int id;
    String name;
    double marks;
    public Student(int id,String name,double marks) {
  	  this.id = id;
  	  this.name = name;
  	  this.marks = marks;
    }
     
}

public class StudentGradeManager {
       private HashMap<Integer,Student> map= new HashMap<>();
       public void addStudent(int id,String name,double marks) {
    	   if(map.containsKey(id)) {
    		   throw new IllegalArgumentException("Student Record Already Exists");
    	   }else {
    		   map.put(id,new Student(id,name,marks));
    		   System.out.println("Added : "+name+" In Record");
    	   }
       }
       public void displayToppers() {
    	    List<Student> list = new ArrayList<>(map.values());

    	    // Sort descending (highest marks first)
    	    list.sort((a, b) -> Double.compare(b.marks, a.marks));

    	    System.out.println("\n🏆 Topper List:");

    	    int rank = 1;

    	    for (Student s : list) {
    	        System.out.printf(
    	            "%d. %s -> %.1f -> %s%n",
    	            rank++,
    	            s.name,
    	            s.marks,
    	            getGrade(s.marks)
    	        );
    	    }
    	}
       
       
       public void displayStats() {
           if (map.isEmpty()) {
               System.out.println("No data available!");
               return;
           }

           double sum = 0;
           double max = Double.MIN_VALUE;
           double min = Double.MAX_VALUE;

           for (Student s : map.values()) {
               sum += s.marks;
               max = Math.max(max, s.marks);
               min = Math.min(min, s.marks);
           }

           double avg = sum / map.size();

           System.out.printf(
               "\n📊 Statistics:\nAvg: %.1f | Max: %.1f | Min: %.1f%n",
               avg, max, min
           );
           
       }
       
       private String getGrade(double  m) {
    	   if(m >90) return "A+";
    	   if(m >80 && m <= 90) return "A";
    	   if(m >70 && m <= 80) return "B";
    	   if(m >60 && m <= 70) return "C";
    	   if(m >50 && m <= 60) return "D";
    	   if(m >40 && m <= 50) return "E";
		   return "F";
       }
       
       public static void main(String[] args) {

           StudentGradeManager mgr = new StudentGradeManager();

           // Adding students
           mgr.addStudent(101, "Manoj", 92.5);
           mgr.addStudent(102, "Rahul", 78.0);
           mgr.addStudent(103, "Priya", 88.5);
           mgr.addStudent(104, "Sneha", 55.0);

           // Display sorted toppers
           mgr.displayToppers();

           // Display statistics
           mgr.displayStats();
       }
       
}

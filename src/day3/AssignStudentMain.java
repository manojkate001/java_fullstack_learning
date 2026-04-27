package day3;

public class AssignStudentMain {
     public static void main(String[] args) {
		AssignStudent s1 = new AssignStudent();
		s1.setValues(1, "Manoj", 22, 98);
		int id1 = s1.getStudentId();
		System.out.println("Student id :"+id1);
		String name1 =s1.getName();
		System.out.println("Student Name :"+name1);
		int age1 = s1.getAge();
		System.out.println("Student Age :"+age1);
		double marks1 = s1.getMarks();
		System.out.println("Student Marks :"+marks1);
		String str = s1.getGrade(98);
		System.out.println("Grade is : "+str);
		
		System.out.println();
		
		AssignStudent s2 = new AssignStudent();
		s2.setValues(2, "Mayur", 24, 99);
		int id2 = s2.getStudentId();
		System.out.println("Student id :"+id2);
		String name2 =s2.getName();
		System.out.println("Student Name :"+name2);
		int age2 = s2.getAge();
		System.out.println("Student Age :"+age2);
		double marks2 = s2.getMarks();
		System.out.println("Student Marks :"+marks2);
		String str2 = s2.getGrade(99);
		System.out.println("Grade is : "+str2);
		
		System.out.println();
		
		AssignStudent s3 = new AssignStudent();
		s3.setValues(3, "Aditya", 24, 69);
		int id3 = s3.getStudentId();
		System.out.println("Student id :"+id3);
		String name3 =s3.getName();
		System.out.println("Student Name :"+name3);
		int age3 = s3.getAge();
		System.out.println("Student Age :"+age3);
		double marks3 = s3.getMarks();
		System.out.println("Student Marks :"+marks3);
		String str3 = s3.getGrade(69);
		System.out.println("Grade is : "+str3);
	}
}

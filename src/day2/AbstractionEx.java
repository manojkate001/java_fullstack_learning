package day2;

abstract class AbstractionEx {
       abstract void area();
}
class Rectangle extends AbstractionEx{
	   Rectangle(){
		   
	   }
	   double length = 7.0;
	   double breadth = 8.0;
	   void area() {
		   double area = length * breadth;
		   System.out.println("Area of Rectangle : "+area);
	   }
}
class Square extends AbstractionEx{
	   double side = 7.0;
	   void area() {
		   double area = side * side;
		   System.out.println("Area of Square : "+area);
	   }
}

class Circle extends AbstractionEx{
	   double radius = 7.0;
	   void area() {
		   double area = 3.14 * radius * radius;
		   System.out.println("Area of Circle : "+area);
	   }
}

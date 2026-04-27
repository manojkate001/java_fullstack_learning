package day_1;

public abstract class Abstraction {
      abstract void display();
      void show() {
    	  System.out.println("From abstract class");
      }
}

class child extends Abstraction{
	public void display() {
		System.out.println("Abstraction implementation");
	}
}

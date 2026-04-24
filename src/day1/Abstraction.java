package day1;

public abstract class Abstraction {
        public abstract void show();
        void display() {
        	System.out.println("This is Abstraction");
        }
}

class child extends Abstraction{
	public void show(){
		System.out.println("This provides implementation from child class");
	}
}

package day4;

public class MyThreadMain {
       public static void main(String[] args) {
		  MyThread m = new MyThread();
		  m.start();
		  
		  Thread t = new Thread(new Mytask());
		  t.start();
	}
}

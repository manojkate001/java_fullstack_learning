package day4;

public class MyThread extends Thread {
        @Override
        public void run(){
        	System.out.println(Thread.currentThread().getName() + "running");
        }
}
class Mytask implements Runnable{
	    @Override
	    public void run() {
	    	System.out.println(Thread.currentThread().getName()+"Running");
	    }
}

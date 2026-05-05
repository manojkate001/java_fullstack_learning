package day4;
class Producer{
	   private int value;
	   private boolean hasItem = false;	
	   
	   public synchronized void produce(int v) throws InterruptedException {
		   while(hasItem) {
			   wait();
		   }
		   value = v;
		   hasItem = true;
		   System.out.println("Produced "+v);
		   notifyAll();
	   }
	   
	   public synchronized void consume() throws InterruptedException{
		   while(!hasItem) {
			   wait();
		   }
		   int temp = value;
		   hasItem = false;
		   System.out.println("Consumes "+ temp);
	   }
}

class Producers extends Thread{
	   private Producer p;
	   public Producers(Producer p) {
		   this.p = p;
	   }
	   
	   public void run() {
		   try {
			   for(int i=1;i<=5;i++) {
				   p.produce(i);
				   Thread.sleep(5000);
				   
			   }
		   }catch(InterruptedException e) {
			   e.printStackTrace();
		   }
	   }
}

class Consumers extends Thread{
	   private Producer p;
	   public Consumers(Producer p) {
		   this.p = p;
	   }
	   
	   public void run() {
		   try {
			   for(int i=1;i<=5;i++) {
				   p.consume();
				   Thread.sleep(5000);
			   }
		   }catch(InterruptedException e) {
			   e.printStackTrace();
		   }
	   }
}
public class ProducerConsumerMain {
       public static void main(String[] args) {
		Producer p = new Producer();
		Producers p1 = new Producers(p);
		Consumers c1 = new Consumers(p);
		
		p1.start();
		c1.start();
	}
}

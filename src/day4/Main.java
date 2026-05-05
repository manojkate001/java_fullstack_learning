package day4;
import java.util.concurrent.atomic.AtomicInteger;
class Counter{
	int count = 0;
	void increment() {
		count++;
	}
}
class SafeCounter{
	int count = 0;
	synchronized void increment() {
		count++;
	}
}
class AtomicCounter{
	AtomicInteger count = new AtomicInteger(0);
	void increment() {
		count.incrementAndGet();
	}
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		Thread t1 = new Thread(() ->{
			for(int i=0;i<1000;i++) {
				c.increment();
			}
		});
		
		Thread t2 = new Thread(() ->{
			for(int i=0;i<1000;i++) {
				c.increment();
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("Unsafe Counter : "+c.count);
		
		SafeCounter s = new SafeCounter();
		Thread t3 = new Thread(() ->{
			for(int i=0;i<1000;i++) {
				s.increment();
			}
		});
		Thread t4 = new Thread(()->{
			for(int i=0;i<1000;i++) {
				s.increment();
			}
		});
		t3.start();
		t4.start();
		
		t3.join();
		t4.join();
		System.out.println("Safe counter : "+s.count);
		
		
		AtomicCounter atomicCounter = new AtomicCounter();

        Thread t5 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                atomicCounter.increment();
            }
        });

        Thread t6 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                atomicCounter.increment();
            }
        });

        t5.start();
        t6.start();

        t5.join();
        t6.join();

        System.out.println("Atomic Counter: " + atomicCounter.count.get());
	}
}

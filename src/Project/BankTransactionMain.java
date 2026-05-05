package Project;
class BankAccount{
	private final String name;
	private double ac_balance;
	public BankAccount(String name,double ac_balance) {
		this.name = name;
		this.ac_balance = ac_balance;
	}
	
	public synchronized void deposit(double amount, String by) {
		double before = ac_balance;
		ac_balance = ac_balance + amount ;
		System.out.printf("[%s] %s deposited RS%.0f | RS%.0f -> RS%.0f%n",
				Thread.currentThread().getName(),
				by,
				amount,
				before,
				ac_balance);
	}
	
	public synchronized void withdraw(double amount,String by) {
		if(amount > ac_balance) {
			System.out.println("["+Thread.currentThread().getName()+"] "+by+":Insufficent Balance");
			return;
		}
		double before = ac_balance;
        ac_balance -= amount;

        System.out.printf("[%s] %s withdrew ₹%.0f | ₹%.0f → ₹%.0f%n",
                Thread.currentThread().getName(),
                by, amount, before, ac_balance);
	}
	
	
	public double getBalance() {
		return ac_balance;
	}
}

public class BankTransactionMain {
      public static void main(String[] args) throws InterruptedException {
		BankAccount b = new BankAccount("Manoj",5000000);
		Thread t1 = new Thread(()->{
			for(int i=1;i<=3;i++) {
				b.deposit(5000,"Manoj");
				try {
					Thread.sleep(300);
				}catch(InterruptedException e) {};
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i=1;i<=3;i++) {
				b.withdraw(500000,"GPay");
			}
			try {
				Thread.sleep(300);
			}catch(InterruptedException e) {};
		},"Thread-GPay");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("\nFinal Balance : RS "+b.getBalance());
	}
}

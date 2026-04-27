package day3;

class InsufficientBalanceException extends Exception{
	private double amount;
	public InsufficientBalanceException(double amount) {
		super("Insufficient Balance. Needed - RS"+amount);
		this.amount = amount ;
	}
	public double getAmount() {
		return amount;
	}
}
public class BankAccount {
       private double balance;
       public BankAccount(double balance) {
    	   this.balance = balance;
       }
       void withdraw(double amount) throws InsufficientBalanceException {
    	   if(amount > balance) {
    		   throw new InsufficientBalanceException(amount-balance);
    	   }
    	   balance = balance - amount;
    	   System.out.println("Withdrawal successful. Remaining balance: ₹" + balance);
       }
}


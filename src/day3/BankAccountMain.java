package day3;

public class BankAccountMain {
      public static void main(String[] args) {
		BankAccount account  = new BankAccount(3000);
		try{
		  account.withdraw(5000);
		}catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
		
	}
}

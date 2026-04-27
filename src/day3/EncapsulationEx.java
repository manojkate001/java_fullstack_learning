package day3;

public class EncapsulationEx {
      private String accountHolder;
      private double bankBalance;
      
      public EncapsulationEx(String accountHolder,double bankBalance) {
    	  this.accountHolder = accountHolder; 
    	  this.bankBalance = bankBalance;
      }
      
      String getAccountHolder() {
    	  return accountHolder;
      }
      double getBankBalance() {
    	  return bankBalance;
      }
      public void depositAmount(Double amount) {
    	  if(amount>0) {
    		  bankBalance += amount;
    		  System.out.println("BankBalance : "+bankBalance);
    	  }
      }
}

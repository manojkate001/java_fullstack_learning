package day3;

public class EncapsulationExMain {
      public static void main(String[] args) {
		EncapsulationEx e1 = new EncapsulationEx("Manoj Kate",1000000);
		String s1 = e1.getAccountHolder();
		System.out.println("Account Holder : "+s1);
		double b1 = e1.getBankBalance();
		System.out.println("Bank Balance : "+b1);
		e1.depositAmount(2000.0);
		
	}
}

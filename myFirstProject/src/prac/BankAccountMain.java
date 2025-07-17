package prac;

public class BankAccountMain {

	public static void main(String[] args) {
	
		BankAccount account= new BankAccount("Alice", 1000);
		System.out.println("Account holder name:" + account.getAccountHolder());
		System.out.println("Initial balance:" + account.getBalance());
		
		account.deposit(500);
		System.out.println("Balance after deposit:" + account.getBalance());
		
		account.withdraw(300);
		System.out.println("Balance after withdrawl"+ account.getBalance());
		
		account.withdraw(2000);
		
		account.setAccountHolder("Ishika");
		System.out.println(account.getAccountHolder());
	}

}

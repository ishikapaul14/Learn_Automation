package prac;

class Account1{
	private String accNo;
	private String accHolderName;
	private double balance;
	
	Account1 (String accNo, String accHolderName,double balance ){
	this.accNo= accNo;
	this.accHolderName= accHolderName;
	this.balance= balance;
	}
	
	void deposit(double amount) {
		if(amount>0) {
			balance+= amount;
			System.out.println("Deposit amount: "+ amount);
		}
		else {
			System.out.println("Invalid deposit amount");
		}
	}
	
	void withdrawl(double amount) {
		if(amount>0 && amount<= balance) {
			balance-= amount;
			System.out.println("Withdrawl amount: "+ amount);
		}
		else
			System.out.println("Invalid witdrawl amount");
	}
	
	void displayAccountDetails() {
		System.out.println("Account holder name: "+ accHolderName);
		System.out.println("Account number: "+ accNo);
		System.out.println("Current Balance: "+ balance);
	}	
}
public class AccountBank {

	public static void main(String[] args) {
		
		Account1 acc= new Account1("12345", "Alice", 1000);
		acc.deposit(200);
		acc.withdrawl(800);
		acc.displayAccountDetails();

	}

}

package prac;

public class Encapsulation {
	
	private String accno;
	private int balance;
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(double amt) {
		if(amt>0)
			balance+= amt;
		else
			System.out.println("amount deposit must be positive");
	}
	public void withdrawl(double amt) {
		if(amt< balance)
			balance-= amt;
		else
			System.out.println("insufficient balance");
	}
	
}

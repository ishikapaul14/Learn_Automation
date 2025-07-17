package prac;

class BankAccount {
	private String accountHolder;
	private double balance;
	
	//constructor 
	public BankAccount(String name, double initialBalance) {
		this.accountHolder= name;
		if(initialBalance>= 0)
			this.balance= initialBalance;
		else
		{
			System.out.println("Initial balance can't be negative. Setting is zero");
			initialBalance= 0;
		}
	}
	//public method for depositing money
	public void deposit(double amount) {
		if(amount> 0) {
			balance+= amount;
			System.out.println("deposited:"+ amount);
		}
		else {
			System.out.println("Invalid deposit amount");
		}
	}
	// public method to withdraw money
	public void withdraw(double amount) {
		if(amount> 0 && amount< balance ) {
			balance+= amount;
			System.out.println("Withdraw:" + amount);
		}
		else
			System.out.println("Invalid withdraw amount or insufficient balance");
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}


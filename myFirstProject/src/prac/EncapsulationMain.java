package prac;

public class EncapsulationMain {

	public static void main(String[] args) {
		
		Encapsulation acc= new Encapsulation();
		acc.setAccno("ACB123");
		acc.deposit(1000);
		acc.withdrawl(200);
		acc.withdrawl(900);
		
		System.out.println("Account no:"+ acc.getAccno());
		System.out.println("Balnce:"+ acc.getBalance());
		

	}
}

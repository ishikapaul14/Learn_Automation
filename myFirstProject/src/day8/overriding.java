package day8;
// overriding
class Bank{
	double roi() {
		return 0;
	}
	int fd() {
		return 0;
	}
	int rd() {
		return 0;
	}
}
class ICICI extends Bank{
	double roi() {
		return 10.5;
	}
	int rd() {
		return 200;
	}
}
class SBI extends Bank{
	double roi() {
		return 11.5;
	}
	int fd() {
		return 200;
	}
}

public class overriding {
	
	public static void main(String[] args) {
		
		ICICI ic= new ICICI();
		System.out.println(ic.roi());
		System.out.println(ic.rd());
		
		SBI sb= new SBI();
		System.out.println(sb.roi());
		System.out.println(sb.fd());
	}

}

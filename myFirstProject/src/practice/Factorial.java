package practice;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int a= sc.nextInt();
		long fac= 1;
		
		for(int i=1; i<= a; i++) {
			fac= i*fac;
		}
		System.out.println("Factorial of "+ a+ "="+ fac);
		
		sc.close();
		
	}

}

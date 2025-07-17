package practice;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int a= sc.nextInt();
		
		int first=0, second= 1;
		System.out.println("Fibonacci series: "+ first+ " "+ second+ " ");
		
		for(int i=2; i<a; i++) {
			int next= first+ second;
			System.out.println(next+ " ");
			first= second;
			second= next;
		}
		sc.close();
	}

}

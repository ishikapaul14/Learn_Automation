package practice;
import java.util.Scanner;
public class Swapping {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter first nmber (a): ");
		int a= sc.nextInt();
		
		System.out.println("Enter second number (b): ");
		int b= sc.nextInt();
		
		int temp= a;
		a= b;
		b= temp;
		
		System.out.println("After swapping: ");
		System.out.println("a= "+ a+ " b= "+b);
		
		sc.close();
	}

}

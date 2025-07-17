package day10;

import java.util.Scanner;

public class HandleException {

	public static void main(String[] args) {
		
		System.out.println("Program is started...");
		
		Scanner sc= new Scanner(System.in);
		
		//Example 1
		System.out.println("Enter a no:");
		int num= sc.nextInt();
		try {
		System.out.println(100/num); //ArithmeticException
		}
		catch(ArithmeticException e) {
			System.out.println("Invalid Data");
		}
		System.out.println("Program is completed...");
		System.out.println("Program is exited..."); 
	}

}

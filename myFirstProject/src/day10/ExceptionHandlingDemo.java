package day10;

import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		try {
			System.out.println("Enter the first integer: ");
			int num1= sc.nextInt();
			System.out.println("Enter the second integer: ");
			int num2= sc.nextInt();
			
			int result= num1/num2;
			System.out.println("Result:"+ result);
		}
		catch(Exception e){
			System.out.println("Error");
		}
		finally {
			System.out.println("program completed");
			sc.close();
		}
	}

}

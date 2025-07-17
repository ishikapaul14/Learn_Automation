package day10;

import java.util.Scanner;

java.util.InputMismatchException;

public class MultiExceptionExample {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		try {
			System.out.println("Enter frist no:");
			int a= sc.nextInt();
			
			System.out.println("Enter second no:");
			int b= sc.nextInt();
			
			int result= a/b;
			System.out.println("Result:"+ result);
			
			String resultStr= String.valueOf(result);
			
			System.out.println("Enter an index to access a character from the result:");
			int index = sc.nextInt();
			
			char ch= resultStr.charAt(index);
			System.out.println("Character at index " + index+ ":"+ ch);
		}
		catch(Exception e) {
			System.out.println("Error:");
		}
		finally {
			System.out.println("Program execution finished");
			sc.close();
		}
	}

}

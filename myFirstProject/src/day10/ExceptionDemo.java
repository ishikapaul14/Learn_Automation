package day10;

import java.util.Scanner;
public class ExceptionDemo {

	public static void main(String[] args) {
		
		System.out.println("Program is started...");
		
		Scanner sc= new Scanner(System.in);
		
		/* Eaxmple 1
		System.out.println("Enter a no:");
		int num= sc.nextInt();
		System.out.println(100/num); */
		
		// Example 2
		/*int a[]= new int[5];
		System.out.println("Enter the position(o-4):");
		int pos= sc.nextInt();
		
		System.out.println("Enter a value");
		int val= sc.nextInt();
		
		a[pos]=val;
		System.out.println(a[pos]);
		 */
		
		// example 3
		/*String s= "welcome";
		int num= Integer.parseInt(s);  //NumberFormatException
		System.out.println(num);
		*/
		
		// Example 4
		String s=null; 
		System.out.println(s.length());
		
		System.out.println("Program is completed...");
		System.out.println("Program is exited..."); 
		
		
	}
}

package dayy4;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		/*String s= "Welcome";
		String s= new String("Welcome")
		System.out.println(s); */
		
		// length of a character- index of string starts with zero
		String s= "Welcome";
				System.out.println(s.length());
				
		// joining strings
		String s1= "Hi";
		String s2= "Hello";
		String s3= "Welcome";
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println(s1.concat(s2+s3));
		
		// trim() -remove spaces on the right and left side
		String a="   HI   ";
		System.out.println(a);
		System.out.println(a.trim());
		
		// charAt()- returns character from a string based on index
		String x= "Welcome";
				System.out.println(x.charAt(0));
				
		// contains() -returns true or false
		System.out.println(x.contains("Wel"));
		
		// equals(), equalsIgnoreCase() -compares strings
		System.out.println(s1.equals(s2));  //case sensitive
		System.out.println(s1.equalsIgnoreCase("hi")); //ignores case
		
		// replace()- replace single/multiple/sequence of characters in a string
		String s4= "Wlcome to java selinium c#";
		System.out.println(s4.replace("a", "X"));
		
		// substring()- extract a substring from the main string
		String s5= "selinium";
		System.out.println(s5.substring(0,2));
		
		// toUpperCase()   toLowerCase()
		System.out.println(s5.toUpperCase());
		System.out.println(s5.toLowerCase());
		
		// split()- split the string into multiple parts based on delimeter
		String s6= "abc@gmail.com";
		String arr[]= s6.split("@");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		System.out.println(Arrays.toString(arr));
		
		// example 1
		String amt= "$15,20,25";
		System.out.println(amt.replace("$","").replace(",",""));
		
		//example 2
		
		
	}

}

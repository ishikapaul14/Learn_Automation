package day10;

public class FinallyBlock {

	public static void main(String[] args) {
		
		String s="welcome";
		
		try {
			System.out.println(s.length());
			}
		catch(NumberFormatException e) {
			System.out.println("Catch block handling Exception...");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("You have entered into finally block");
		}
		System.out.println("Program is finished");
	}

}

package day10;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		
		System.out.println("program has started...");
		String s= null;
		try {
		System.out.println(s.length());
		}
		/*catch(ArithmeticException e) {
			System.out.println("Handling Exception...");
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("Handling Exception...");
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e) {
			System.out.println("Handling Exception...");
			System.out.println(e.getMessage());
		}*/
		catch(Exception e) {
			System.out.println("Handling Exception...");
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program is finished");
		
		
		}

}

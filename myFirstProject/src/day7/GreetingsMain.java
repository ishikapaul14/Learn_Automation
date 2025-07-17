package day7;

public class GreetingsMain {

	public static void main(String[] args) {
		//All objects come under the main methods
		
		Greetings gr= new Greetings();  //creating object of Greetings class
		gr.m1(); //calling method from Greetings class
		
		String s= gr.m2();
		System.out.println(s);
		
		gr.m3("john");
		
		String var= gr.m4("David");
		System.out.println(var);
	}

}

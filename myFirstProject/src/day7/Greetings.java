package day7;

public class Greetings {
	
	// 1) no params    no return
	
			void m1()
			{
				System.out.println("Hello");
			}
			
	// 2) no params  return value
			String m2()
			{
				return ("Hello how are you?");
			}
	// 3) takes params  no return value
			void m3(String name)
			{
				System.out.println("hello"+ name);
			}
	// 4) takes params  returns value
			String m4(String name)
			{
				return("Hello"+name);
			}
}

package practice;

class MathOperations{
	int add(int a, int b) {
		
		return a+b;
	}
	double add(double a, double b) {
		return a+b;
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		
		MathOperations m= new MathOperations();
		System.out.println("Int add: " + m.add(2, 3));
		System.out.println("Double add: " + m.add(2.3, 4.5));
		
	}

}

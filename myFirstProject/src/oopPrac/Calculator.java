package oopPrac;

public class Calculator {
	
	void add(int a, int b) {
		int sum= a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		Calculator cal= new Calculator();
		cal.add(10, 20);

	}

}

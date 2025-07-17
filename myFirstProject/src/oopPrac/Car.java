package oopPrac;

public class Car {
	
	String brand;
	int year;
	
	void display() {
		System.out.println(brand);
		System.out.println(year);
	}
	
	public static void main(String[] args) {
		
		Car c= new Car();
		c.brand= "Volvo";
		c.year= 2025;
		c.display();

	}

}

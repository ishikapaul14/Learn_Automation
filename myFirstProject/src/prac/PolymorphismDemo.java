package prac;

class AreaCalculator{
	double circle(double r) {
		return Math.PI*r*r;
	}
	double rectangle(double l, double b) {
		return l*b;
	}
	int square(int s) {
		return s*s;
	}
}

public class PolymorphismDemo {

	public static void main(String[] args) {
	
		AreaCalculator area= new AreaCalculator();
		System.out.println(area.circle(23.5));
		System.out.println(area.rectangle(10.5, 11.5));
		System.out.println(area.square(12));
	}

}

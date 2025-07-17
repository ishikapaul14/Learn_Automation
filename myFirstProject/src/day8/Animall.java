package day8;

public class Animall {

		String colour = "white";
		
		void eat() {
			System.out.println("eating..");
		}
}
class Cat extends Animall{
	String colour="black";
	
	void displaycolour() {
		System.out.println(super.colour);
	}
		void eat() {
			System.out.println("eating bread..");
			super.eat();  // invoking immediate parent class method
		} 
}
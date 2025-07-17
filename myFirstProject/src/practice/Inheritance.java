package practice;

class Animal{
	void sound() {
		System.out.println("Animals make sound.");
	}
}
class Dog extends  Animal{
	void sound() {
		System.out.println("Dog barks ");
	}
}


public class Inheritance {

	public static void main(String[] args) {
		
		Dog a= new Dog();
		a.sound();

	}

}

package day8;

class Animals{
	String sound() {
		return "Animal makes a sound";
	}
}
class Dog extends Animals{
	void noise() {
		Animals dobj= new Animals();
//		dobj.sound();
		System.out.println(dobj.sound()+ "Dog Barks");
	}
}



public class Animal {

	public static void main(String[] args) {
		Dog obj= new Dog();
		obj.noise();
//		Animals aobj= new Animals();
//		aobj.sound();
	}

}

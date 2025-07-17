package day8;

final class Test1{
	final void m() {
		System.out.println("this is m method for Test1");
	}
}
class Test2 extends Test1{ // incorrect because Test1 is final class
	void m(){     // incorrect, bcoz m is final method
		System.out.println("this is m method for Test2");
		}
} 

public class FinalKeyword2 {

	public static void main(String[] args) {
		

	}

}

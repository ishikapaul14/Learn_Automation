package day8;

class Test{
	final int x=100;
}




public class Finalkeyword {

	public static void main(String[] args) {
		
		Test t= new Test();
		t.x= 200; // incorrect because final keyword
		
		System.out.println(t.x);

	}

}

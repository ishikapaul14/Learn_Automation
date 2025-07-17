package day7;

public class Constructor {
	
	int x,y;
	
	Constructor()   //default constructor
	{
		x=100;
		y=200;
	}
	Constructor(int a, int b)   //parameterized constructor
	{
		x=a;
		y=b;
	}
	void sum()
	{
		System.out.println(x+y);
	}
	
	
	
	
	public static void main(String[] args) {
		
			//ConstructorName varName= new ConstructorName(); // invoke default constructor
		Constructor cd= new Constructor(10,20);	// creating an object
		cd.sum();  // calling method
		
		Constructor cdd= new Constructor();
		cdd.sum();
	}

}

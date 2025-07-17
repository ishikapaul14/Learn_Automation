package prac;

class Person{
	String name;
	int age;
	
	void displayinfo() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		}
	}
class Teacher extends Person{
	String subject;
	void displaysubject() {
		System.out.println("subject:"+ subject);
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		
		Teacher t= new Teacher();
		t.name= "John";
		t.age= 25;
		t.subject= "Maths";
		
		t.displayinfo();
		t.displaysubject();
        
	}

}

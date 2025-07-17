package oopPrac;

public class Student {
	
	String name;
	int age;
	
	Student (String n, int a){
		name= n;
		age= a;
	}
	void display() {
		System.out.println(name+" "+age);
	}
	
	
	public static void main(String[] args) {
		Student stu= new Student("Alice", 18);
		stu.display();

	}

}

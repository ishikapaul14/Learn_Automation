package practice;

class Student{
	String name;
	Student(String studentName){
		name= studentName;
	}
	void display() {
		System.out.println("Student namee: "+ name);
	}
}

public class Constructor {

	public static void main(String[] args) {
		
		Student s1= new Student("Alice");
		s1.display();
	}

}

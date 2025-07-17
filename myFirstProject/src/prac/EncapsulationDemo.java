package prac;

class Student{
	private String name;
	private int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMarks(int marks) {
		if(marks>= 0 && marks<=100)
		this.marks = marks;
		else
		System.out.println("Invald marks");
	}
	public int getMarks() {
		return marks;
	}	
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Student s= new Student();
		s.setName("Alice");
		s.setMarks(57);
		System.out.println("Name:"+ s.getName());
		System.out.println("Marks:"+ s.getMarks());
		
	}

}

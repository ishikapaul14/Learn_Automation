package day6;

public class StudentMain {

	public static void main(String[] args) {
		
		Student stu1= new Student(); // creating a new object
		
		stu1.sid= 101;
		stu1.sname="smith";
		stu1.grad='A';
		stu1.printData();

		Student stu2= new Student();
		
		stu2.sid= 102; 
		stu2.sname="john";
		stu2.grad='B';
		stu2.printData();
	}

}

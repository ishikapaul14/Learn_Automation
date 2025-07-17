package day7;

public class StudentMain {
	
	public static void main(String[] args) {
	
//	Student stu= new Student();  //object is created
	
	// 1) store data using object reference variables
//	stu.sid= 101;
//	stu.sname="john";
//	stu.grad= 'A';
//	stu.printStudentData();
	
	// 2) using method
//	stu.setStudentData(101, "David", 'A');
//	stu.printStudentData();
	
	//3) using constructor-automatically executed when object is created
		Student stu= new Student(101, "John", 'A');
		stu.printStudentData();
	}
}

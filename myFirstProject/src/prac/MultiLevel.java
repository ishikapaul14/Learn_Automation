package prac;


class PersonNew{
	void work() {
		System.out.println("Person is working");
	}
}

class Employee extends PersonNew{
	@Override
	void work() {
	System.out.println("Employee is working");
	}
}
class Manager extends Employee{
	@Override
	void work() {
		System.out.println("Manager is working and managing the team ");
	}
	
}


//class MultiLevel{
//	
//
//}
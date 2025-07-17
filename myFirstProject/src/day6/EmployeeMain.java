package day6;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1= new Employee(); //object
		emp1.eid= 101;
		emp1.ename= "john";
		emp1.job= "Manager";
		emp1.sal= 50000;
		emp1.display();  //calling display method
//		System.out.println(emp1.eid); // if not using the display method
		
		Employee emp2= new Employee();
		emp2.eid= 102;
		emp2.ename= "David";
		emp2.job= "engineer";
		emp2.sal= 60000;
		emp2.display();

	}

}

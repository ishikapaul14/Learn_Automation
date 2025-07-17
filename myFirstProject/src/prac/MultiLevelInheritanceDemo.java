package prac;



public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {
		
		PersonNew p= new PersonNew();
		p.work();
		
		Employee e= new Employee();
		e.work();
		
		Manager m= new Manager();
		m.work();

	}

}

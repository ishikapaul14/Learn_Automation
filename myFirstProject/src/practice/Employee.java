package practice;

 class Employee {
	 String name;
	 double salary;
	 double bonus; 

	 public Employee(String name, double salary) {
		 this.name= name;
		 this.salary= salary;
	}

	double calculateBonus() {
		 bonus= salary *(10/100);
		 return bonus;
	 }

 }

package practice;

class Person{
	private String name;
	
	public void setName(String newName) {
		name= newName;
	}
	
	public String getName() {
		return name;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		
		Person p= new Person();
		p.setName("John");
		System.out.println("Name: "+ p.getName());
	}

}

package oopPrac;

public class Book {
	
	String title, author;
	Book(String t, String a) {
		title= t;
		author= a;
	}
	void display(){
		System.out.println(title+" "+author);
	}
	
	public static void main(String[] args) {
		
		Book b= new Book("Book 1","xyz");
		b.display();
		Book bb= new Book("Book 2","abc");
		bb.display();
		
	}

}

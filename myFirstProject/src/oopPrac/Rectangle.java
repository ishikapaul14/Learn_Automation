package oopPrac;

public class Rectangle {
	int width, height;
	// overloading
	Rectangle(){
		width=1;
		height= 1;
	}
	Rectangle(int w, int h){
		width=w;
		height=h;
	}
	void area() {
		System.out.println("Area="+ width*height);
	}

	public static void main(String[] args) {
		
		Rectangle rec= new Rectangle();
		rec.area();
		
		Rectangle rec1= new Rectangle(20, 5);
		rec1.area();

	}

}

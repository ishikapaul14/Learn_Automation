package prac;

// Superclass
class Shape {
    double area() {
        return 0;
    }

    void display() {
        System.out.println("This is a shape");
    }

    void display(String s) {
        System.out.println("Shape name is " + s);
    }

    void display(String s, double area) {
        System.out.println("Shape name is " + s + " and area is " + area);
    }
}

// Subclass
class Circle extends Shape {
    double radius;

    double calculate(double r) {
        radius = r;
        return radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Subclass
class Rectangle extends Shape {
    double length, breadth;

    void calculate(double l, double b) {
        length = l;
        breadth = b;
    }

    @Override
    double area() {
        return length * breadth;
    }
}

// Main class
public class Polymorphism {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.display();
        shape.display("Generic Shape");

        Circle c = new Circle();
        c.calculate(2.4);
        double circleArea = c.area();
        c.display("Circle", circleArea);

        Rectangle r = new Rectangle();
        r.calculate(3, 5.5);
        double rectArea = r.area();
        r.display("Rectangle", rectArea);

        // Polymorphism in action
        Shape s1 = new Circle();
        ((Circle) s1).calculate(7);
        System.out.println("Polymorphic Circle Area: " + s1.area());
    }
}

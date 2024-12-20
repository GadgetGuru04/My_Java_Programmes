interface Shape {
    double area();
    double perimeter();
}

class GeometricShape {
    String color;

    public GeometricShape(String color) {
        this.color = color;
    }

    public void displayColour() {
        System.out.println("Color: " + color);
    }
}

class Circle extends GeometricShape implements Shape {
    double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Square extends GeometricShape implements Shape {
    double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    public double area() {
        return side * side;
    }

    public double perimeter() {
        return 4 * side;
    }
}

public class hybridInheritanceOfShape {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "Red");
        Square square = new Square(4, "Blue");

        System.out.println("Circle:");
        circle.displayColour();
        System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());

        System.out.println("\nSquare:");
        square.displayColour();
        System.out.println("Area: " + square.area());
        System.out.println("Perimeter: " + square.perimeter());
    }
}

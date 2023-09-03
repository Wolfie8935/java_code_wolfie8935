class Shape {
    public double getPerimeter() {
        return 0.0; // Default implementation for any shape
    }

    public double getArea() {
        return 0.0; // Default implementation for any shape
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class app5 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);

        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Circle Area: " + circle.getArea());
    }
}

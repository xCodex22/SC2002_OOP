package Lab.lab4.Shape;

// 2D Figure of Circle
// Implements Shape
public class Circle implements Shape {
    // Attributes
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    // Method
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Getter
    public double getRadius() {
        return radius;
    }
}

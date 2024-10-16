package Lab.lab4.Shape;

// 2D Figure of Triangle
// Implements Shape
public class Triangle implements Shape{
    // Attributes
    private double height;
    private double base;

    // Constructor
    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    // Methods
    public double calculateArea() {
        return 0.5 * base * height;
    }

    // Getter
    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }
}

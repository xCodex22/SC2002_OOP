package Lab.lab4.Shape;

// 2D Figure of Rectangle
// Implements Shape
public class Rectangle implements Shape{
    // Attributes
    private double length;
    private double breath;

    // Constructor
    public Rectangle(double length, double breath) {
        this.length = length;
        this.breath = breath;
    }

    // Methods
    public double calculateArea() {
        return length * breath;
    }

    // Getter
    public double getLength() {
        return length;
    }

    public double getBreath() {
        return breath;
    }
}

package Lab.lab4.Shape;

// 2D Figure of Square
// Implements Shape
public class Square implements Shape{
    // Attributes
    private double side;

    // Constructor
    public Square(double side) {
        this.side = side;
    }

    // Methods
    public double calculateArea() {
        return side * side;
    }

    // Getter 
    public double getSide() {
        return side;
    }
}

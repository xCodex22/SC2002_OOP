package Lab.lab4.Shape;

// Cube is-a Square
// Cube inherits from Square
public class Cube extends Square{
    public Cube(double side) {
        super(side);
    }

    public double calculateArea() {
        return 6 * super.calculateArea();
    }
}

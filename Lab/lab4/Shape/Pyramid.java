package Lab.lab4.Shape;

// Square based Pyramid has-a Triangle and Square
// Composition Relationship
public class Pyramid implements Shape{
    private Square base;
    private Triangle[] faces;
    private double height;
    // Constructor
    public Pyramid(double height, double side) {
        this.base = new Square(side);
        this.height = height;

        double slantHeight = Math.sqrt(Math.pow(height, 2) + Math.pow(side / 2, 2));

        this.faces = new Triangle[4];
        for (int i = 0; i < 4; i++) {
            faces[i] = new Triangle(slantHeight, side); 
        }
    }

    // Method
    public double calculateArea() {
        return base.calculateArea() + 4 * faces[0].calculateArea();
    }

    // getter
    public double getHeight() {
        return height;
    }
}

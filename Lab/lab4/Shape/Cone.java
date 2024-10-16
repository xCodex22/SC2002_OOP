package Lab.lab4.Shape;

// 3D Figure of Cone
// Cone Inherits from Circle 
// Cone is-a Circle
public class Cone extends Circle{
    // Added Attribute
    private double height;

    // Constructor
    public Cone(double height, double radius) {
        super(radius);
        this.height = height;
    }

    // Method
    public double calculateArea() {
        double rad = super.getRadius();
        return Math.PI * rad * (rad + Math.sqrt(height * height + rad * rad));
    }
}

package Lab.lab4.Shape;

// Sphere is-a Circle
// Sphere inherits from circle
public class Sphere extends Circle{
    // Construtor
    public Sphere(double radius) {
        super(radius);
    }

    // Method
    public double calculateArea() {
        return 4 * Math.PI * getRadius() * getRadius(); 
    }
}

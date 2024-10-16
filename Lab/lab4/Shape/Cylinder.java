package Lab.lab4.Shape;

// Cylinder Inherits from Circle 
// Cylinder is-a Circle
public class Cylinder extends Circle{
    private double length;

    public Cylinder(double radius, double length) {
        super(radius);
        this.length = length;
    }

    public double calculateArea() {
        double baseArea = 2 * super.calculateArea();
        double lateralArea = 2 * Math.PI * super.getRadius() * length;
        return baseArea + lateralArea;
    }
}

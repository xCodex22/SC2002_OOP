package Lab.lab4.Shape;

// Cuboid has-a Rectangle
// Composition Relationship
public class Cuboid implements Shape{
    private double height;
    private Rectangle base;

    // Constructor
    public Cuboid(double length, double breath, double height) {
        this.height = height;
        this.base = new Rectangle(length, breath);
    }
    
    public double calculateArea() {
        double length = base.getLength();
        double breath = base.getBreath();
        return 2 * (base.calculateArea() + breath * height + length * height);
    }
}

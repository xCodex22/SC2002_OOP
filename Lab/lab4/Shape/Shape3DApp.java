package Lab.lab4.Shape;

import java.util.Scanner;
// Main App for 3D Shapes
public class Shape3DApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of 3D Figures: ");
        int numOfShapes = scanner.nextInt();

        Shape[] shapes = new Shape[numOfShapes];
        for (int i = 0; i < numOfShapes; i++) {
            System.out.println("Choose Type of 3D Figure");
            System.out.println("1: Sphere");
            System.out.println("2: Pyramid");
            System.out.println("3: Cuboid");
            System.out.println("4: Cube");
            System.out.println("5: Cone");
            System.out.println("6: Cylinder");
            int shapeType = scanner.nextInt();

            switch(shapeType) {
                case 1:
                    System.out.println("Sphere:");
                    System.out.println("Enter Radius:");
                    double radius = scanner.nextInt();
                    shapes[i] = new Sphere(radius);
                    break;
                case 2:
                    System.out.println("Pyramid:");
                    System.out.println("Enter Height:");
                    double height = scanner.nextInt();
                    System.out.println("Enter Base:");
                    double base = scanner.nextInt();
                    shapes[i] = new Pyramid(height, base);
                    break;
                case 3:
                    System.out.println("Cuboid:");
                    System.out.println("Enter Length:");
                    double length = scanner.nextInt();
                    System.out.println("Enter Breath:");
                    double breath = scanner.nextInt();
                    System.out.println("Enter Height:");
                    double height2 = scanner.nextInt();
                    shapes[i] = new Cuboid(length, breath, height2);
                    break;
                case 4:
                    System.out.println("Cube:");
                    System.out.println("Enter Side:");
                    double side = scanner.nextInt();
                    shapes[i] = new Cube(side);
                    break;
                case 5:
                    System.out.println("Cone:");
                    System.out.println("Enter Radius:");
                    double r = scanner.nextInt();
                    System.out.println("Enter Height:");
                    double h = scanner.nextInt();
                    shapes[i] = new Cone(h, r);
                    break;
                case 6:
                    System.out.println("Cylinder:");
                    System.out.println("Enter Radius:");
                    double rad = scanner.nextInt();
                    System.out.println("Enter Length:");
                    double len = scanner.nextInt();
                    shapes[i] = new Cylinder(rad, len);
                    break;
                default:
                    System.out.println("Invalid Choice");
                    i--;
            }
        }
        double totalArea = 0;
        for (int j = 0; j < numOfShapes; j++) {
            totalArea += shapes[j].calculateArea();
        }
        System.out.println("Total Surface Area of the 3D Shapes: " + totalArea);
        scanner.close();
    }
}


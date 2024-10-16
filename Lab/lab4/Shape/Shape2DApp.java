package Lab.lab4.Shape;

import java.util.Scanner;
// Main App for 2D Shapes
public class Shape2DApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of Shapes: ");
        int numOfShapes = scanner.nextInt();

        Shape[] shapes = new Shape[numOfShapes];
        for (int i = 0; i < numOfShapes; i++) {
            System.out.println("Choose Type of Shape");
            System.out.println("1: Circle");
            System.out.println("2: Triangle");
            System.out.println("3: Rectangle");
            System.out.println("4: Square");
            int shapeType = scanner.nextInt();

            switch(shapeType) {
                case 1:
                    System.out.println("Circle:");
                    System.out.println("Enter Radius:");
                    int radius = scanner.nextInt();
                    shapes[i] = new Circle(radius);
                    break;
                case 2:
                    System.out.println("Triangle:");
                    System.out.println("Enter Height:");
                    int height = scanner.nextInt();
                    System.out.println("Enter Base:");
                    int base = scanner.nextInt();
                    shapes[i] = new Triangle(height, base);
                    break;
                case 3:
                    System.out.println("Rectangle:");
                    System.out.println("Enter Length:");
                    int length = scanner.nextInt();
                    System.out.println("Enter Breath:");
                    int breath = scanner.nextInt();
                    shapes[i] = new Rectangle(length, breath);
                    break;
                case 4:
                    System.out.println("Square:");
                    System.out.println("Enter Side:");
                    int side = scanner.nextInt();
                    shapes[i] = new Square(side);
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
        System.out.println("Total Area of the 2D Shapes: " + totalArea);
        scanner.close();
    }

    
}

import java.util.Scanner;

public class Shape2DApp {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the total number of shapes: ");
            int numShapes = sc.nextInt();
            Shape[] shapes = new Shape[numShapes];
            int count = 0;

            while (numShapes > 0) {
                System.out.println("Choose 1 for square");
                System.out.println("Choose 2 for rectangle");
                System.out.println("Choose 3 for circle");
                System.out.println("Choose 4 for triangle");
                System.out.println("Enter choice: ");

                int choice = sc.nextInt();
                switch(choice){
                    case 1:
                        System.out.println("Enter length of square: ");
                        int len = sc.nextInt();
                        shapes[count] = new Square(len);
                        numShapes--;
                        count++;
                        break;
                    case 2:
                        System.out.println("Enter length of rectangle: ");
                        int length = sc.nextInt();
                        System.out.println("Enter breadth of rectangle: ");
                        int breadth = sc.nextInt();
                        shapes[count] = new Rectangle(length, breadth);
                        numShapes--;
                        count++;
                        break;
                    case 3:
                        System.out.println("Enter radius of circle: ");
                        int rad = sc.nextInt();
                        shapes[count] = new Circle(rad);
                        numShapes--;
                        count++;
                        break;
                    case 4:
                        System.out.println("Enter height of triangle: ");
                        int height = sc.nextInt();
                        System.out.println("Enter base of rectangle: ");
                        int base = sc.nextInt();
                        shapes[count] = new Triangle(height, base);
                        numShapes--;
                        count++;
                        break;
                    default:
                        System.out.println("Invalid input, please try again!");
                }
            }
            double totalArea = 0;
            for (Shape shape : shapes){
                totalArea += shape.getArea();
            }
            System.out.println("The total area of the figure is: " + totalArea);
        }
}

import java.util.Scanner;

public class Shape2DApp{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int totalShapes;

        System.out.println("Enter the total number of shapes:");
        totalShapes = in.nextInt();
        Shape[] shapes = new Shape[totalShapes];

        // Initialise all shapes
        for (int i = 0; i < totalShapes; ++i){
            System.out.printf("What shape do you want? \n1.Square \n2.Rectangle \n3.Circle \n4.Triangle \n");
            int selectShape = in.nextInt();

            switch(selectShape){
                case 1:
                    System.out.println("Enter the length of the square:");
                    double length = in.nextDouble();
                    shapes[i] = new Square(length);
                    break;
                
                case 2:
                    System.out.println("Enter the length of the rectangle:");
                    length = in.nextDouble();
                    System.out.println("Enter the width of the rectangle:");
                    double width = in.nextDouble();
                    shapes[i] = new Rectangle(length, width);
                    break;

                case 3:
                    System.out.println("Enter the length of the radius:");
                    double radius = in.nextDouble();
                    shapes[i] = new Circle(radius);
                    break;

                case 4:
                    System.out.println("Enter the length of the base");
                    double base = in.nextDouble();
                    System.out.println("Enter the length of the height:");
                    double height = in.nextDouble();
                    shapes[i] = new Triangle(base, height);
            }
        }
        System.out.println("Specify calculation \n1.Area\n2.Volume (not yet implemented)");
        int selectCalculation = in.nextInt();
        switch(selectCalculation){
            case 1:
                double totalArea = 0;
                for (Shape shape : shapes){
                    totalArea += shape.findArea();
                }
                System.out.println("The total area is " + totalArea);
                break;
        }
    }
}

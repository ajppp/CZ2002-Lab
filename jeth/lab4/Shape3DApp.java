import java.util.Scanner;

public class Shape3DApp{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int totalShapes;

        System.out.println("Enter the total number of shapes:");
        totalShapes = in.nextInt();
        Shape[] shapes = new Shape[totalShapes];

        // Initialise all shapes
        for (int i = 0; i < totalShapes; ++i){
            System.out.printf("What shape do you want? \n1.Sphere \n2.Pyramid \n3.Cuboid \n4.Cone \n5.Cylinder\n");
            int selectShape = in.nextInt();

            switch(selectShape){
                case 1:
                    System.out.println("Enter the radius of the sphere:");
                    double radius = in.nextDouble();
                    shapes[i] = new Sphere(radius);
                    break;
                
                case 2:
                    System.out.println("Enter the length of the base:");
                    double base = in.nextDouble();
                    System.out.println("Enter the length of the height:");
                    double height = in.nextDouble();
                    shapes[i] = new Pyramid(base, height);
                    break;

                case 3:
                    System.out.println("Enter the length of the width:");
                    double width = in.nextDouble();
                    System.out.println("Enter the length of the height:");
                    height = in.nextDouble();
                    shapes[i] = new Cuboid(height, width);
                    break;

                case 4:
                    System.out.println("Enter the length of the base");
                    base = in.nextDouble();
                    System.out.println("Enter the length of the height:");
                    height = in.nextDouble();
                    shapes[i] = new Cone(base, height);
                    break;

                case 5:
                    System.out.println("Enter the length of the width");
                    width = in.nextDouble();
                    System.out.println("Enter the length of the height");
                    height = in.nextDouble();
                    shapes[i] = new Cylinder(height, width);
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

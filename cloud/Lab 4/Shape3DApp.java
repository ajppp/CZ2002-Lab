import java.util.Scanner;

public class Shape3DApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of shapes: ");
        int numShapes = sc.nextInt();
        Shape[] shapes = new Shape[numShapes];
        int count = 0;

        while (numShapes > 0) {
            System.out.println("Choose 1 for sphere");
            System.out.println("Choose 2 for pyramid");
            System.out.println("Choose 3 for cuboid");
            System.out.println("Choose 4 for cone");
            System.out.println("Choose 5 for cylinder");
            System.out.println("Enter choice: ");

            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter radius of sphere: ");
                    int rad = sc.nextInt();
                    shapes[count] = new Sphere(rad);
                    numShapes--;
                    count++;
                    break;
                case 2:
                    System.out.println("Enter height of pyramid: ");
                    int height = sc.nextInt();
                    System.out.println("Enter base of pyramid: ");
                    int base = sc.nextInt();
                    shapes[count] = new Rectangle(height, base);
                    numShapes--;
                    count++;
                    break;
                case 3:
                    System.out.println("Enter length of cuboid: ");
                    int length = sc.nextInt();
                    System.out.println("Enter breadth of cuboid: ");
                    int breadth = sc.nextInt();
                    shapes[count] = new Cuboid(length, breadth);
                    numShapes--;
                    count++;
                    break;
                case 4:
                    System.out.println("Enter radius of cone: ");
                    int r = sc.nextInt();
                    System.out.println("Enter height of cone: ");
                    int h = sc.nextInt();
                    shapes[count] = new Cone(r, h);
                    numShapes--;
                    count++;
                    break;
                case 5: 
                    System.out.println("Enter radius of cylinder: ");
                    int rd = sc.nextInt();
                    System.out.println("Enter height of cylinder: ");
                    int hg = sc.nextInt();
                    shapes[count] = new Cylinder(rd, hg);
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

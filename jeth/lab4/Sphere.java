public class Sphere implements Shape{
    private double radius;

    public Sphere(double radius){
        this.radius = radius;
    }

    public double findArea(){
        return 4 * new Circle(radius).findArea();
    }
}

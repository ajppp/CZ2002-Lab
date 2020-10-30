import java.lang.Math;

public class Cylinder implements Shape{
    private double length;
    private double width;

    public Cylinder(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double findArea(){
        return 2*(new Circle(width / 2).findArea()) + new Rectangle(length, Math.PI * width).findArea();
    }
}

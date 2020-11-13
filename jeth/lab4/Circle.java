public class Circle implements Shape{
    static double PI = 3.141592653589793;
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    
    public double findArea(){
        return PI * radius * radius;
    }
}


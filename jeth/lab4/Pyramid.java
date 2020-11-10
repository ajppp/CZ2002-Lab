public class Pyramid implements Shape{
    private double base;
    private double height;

    public Pyramid(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double findArea(){
        return 4 * new Triangle(base, height).findArea() + new Square(base).findArea();
    }
}

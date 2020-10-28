public class Cuboid implements Shape{
    private double length;
    private double width;

    public Cuboid(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double findArea(){
        return 4 * new Rectangle(length, width).findArea() + 2 * new Square(width).findArea();
    }
}

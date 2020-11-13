public class Square implements Shape{

    private double side;

    public Square(double side){
        this.side = side;
    }

    public double getSide(){
        return side;
    }
    
    public double findArea(){
        return side * side;
    }
}

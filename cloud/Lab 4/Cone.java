public class Cone extends Circle{
    private int height;

    public Cone(int radius, int height) {
		super(radius);
		this.height = height;
    }
    
    public double surfaceArea(){
        // I included the base area 
        return super.getArea() + Math.PI*super.getRadius()*Math.pow(this.height*this.height+super.getRadius()*super.getRadius(), 0.5);
    }
    
}

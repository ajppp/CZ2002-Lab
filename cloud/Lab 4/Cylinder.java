public class Cylinder extends Circle{
    private int height;

    public Cylinder(int radius, int height) {
		super(radius);
		this.height = height;
    }

    public double surfaceArea(){
        // I included the 2 base circles as well
        return 2*super.getArea() + 2*super.getRadius()*Math.PI*height;
    }
    
}
